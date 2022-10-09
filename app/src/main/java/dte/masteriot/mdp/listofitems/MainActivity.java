// Parts of the code of this example app have ben taken from:
// https://enoent.fr/posts/recyclerview-basics/
// https://developer.android.com/guide/topics/ui/layout/recyclerview

package dte.masteriot.mdp.listofitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.selection.ItemKeyProvider;
import androidx.recyclerview.selection.SelectionTracker;
import androidx.recyclerview.selection.StableIdKeyProvider;
import androidx.recyclerview.selection.StorageStrategy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ListOfItems, MainActivity";

    // App-specific dataset:
    private static final List<Item> listofitems = new ArrayList<>();
    private static boolean listofitemsinitialized = false;

    private RecyclerView recyclerView;
    private MyAdapter recyclerViewAdapter;
    private SelectionTracker tracker;
    private MyOnItemActivatedListener onItemActivatedListener;
    private Object next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the list of items (the dataset):
        initListOfItems();

        // Prepare the RecyclerView:
        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter = new MyAdapter(this, listofitems);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // Choose the layout manager to be set.
        // some options for the layout manager:  GridLayoutManager, LinearLayoutManager, StaggeredGridLayoutManager
        // initially, a linear layout is chosen:
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Selection tracker (to allow for selection of items):
        onItemActivatedListener = new MyOnItemActivatedListener(this, recyclerViewAdapter);
        tracker = new SelectionTracker.Builder<>(
                "my-selection-id",
                recyclerView,
                new MyItemKeyProvider(ItemKeyProvider.SCOPE_MAPPED, recyclerViewAdapter),
//                new StableIdKeyProvider(recyclerView), // This caused the app to crash on long clicks
                new MyItemDetailsLookup(recyclerView),
                StorageStrategy.createLongStorage())
                .withOnItemActivatedListener(onItemActivatedListener)
                .build();
        recyclerViewAdapter.setSelectionTracker(tracker);

        if (savedInstanceState != null) {
            // Restore state related to selections previously made
            tracker.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        tracker.onSaveInstanceState(outState); // Save state about selections.
    }

    // ------ Initialization of the dataset ------ //

    private void initListOfItems () {

        listofitems.add(new Item("Burrito Tierra", "https://www.tierraburritos.com/", "Mejicano" , (long) 0 , R.drawable.tierra));
        listofitems.add(new Item("80 grados", "https://ochentagrados.com/", "Tradicional" , (long) 1 , R.drawable._0grados));
        listofitems.add(new Item("La musa", "https://grupolamusa.com/restaurante-musa-malasana/", "Tapas" , (long) 2 , R.drawable.lamusa));
        listofitems.add(new Item("La mejor hamburguesa", "https://lamejorhamburguesa.com/", "Hamburguesa" , (long) 3 , R.drawable.lamejorhamaburguesa));
        listofitems.add(new Item("Sublime", "https://www.sublimeworldrestaurant.com//", "Hamburguesa" , (long) 4 , R.drawable.sublime));
        listofitems.add(new Item("El 2 de Fortuny", "https://www.loscervecistas.es/locales-cervecistas/el-2-de-fortuny/", "Tradicional" , (long) 5 , R.drawable.el2defortuny));





        // Populate the list of items if not done before:
        /*final int ITEM_COUNT = 50;
        if (listofitemsinitialized == false) {
            for (int i = 0; i < ITEM_COUNT; ++i) {
                listofitems.add(new Item("Item " + i, "This is the item number " + i, (long) i));
            }
            listofitemsinitialized = true;
        }*/

    }

    // ------ Buttons' on-click listeners ------ //

    public void listLayout(View view) {
        // Button to see in a linear fashion has been clicked:
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void gridLayout(View view) {
        // Button to see in a grid fashion has been clicked:
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
    }

    public void seeCurrentSelection(View view) {
        // Button "see current selection" has been clicked:

        Iterator iteratorSelectedItemsKeys = tracker.getSelection().iterator();
        // This iterator allows to navigate through the keys of the currently selected items.
        // Complete info on getSelection():
        // https://developer.android.com/reference/androidx/recyclerview/selection/SelectionTracker#getSelection()
        // Complete info on class Selection (getSelection() returns an object of this class):
        // https://developer.android.com/reference/androidx/recyclerview/selection/Selection

        String text = "";
        while (iteratorSelectedItemsKeys.hasNext()) {
            text += iteratorSelectedItemsKeys.next().toString();
            if (iteratorSelectedItemsKeys.hasNext()) {
                text += ", ";
            }
        }
        text = "Keys of currently selected items = \n" + text;
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("text", text);
        startActivity(i);
    }

    public void Eliminate(View view) {
        // Button "see current selection" has been clicked:

        Iterator iteratorSelectedItemsKeys = tracker.getSelection().iterator();

        while (iteratorSelectedItemsKeys.hasNext()) {
            recyclerViewAdapter.removeItem(Long.parseLong(iteratorSelectedItemsKeys.next().toString()));
            //recyclerViewAdapter.notifyItemRemoved(Integer.parseInt(iteratorSelectedItemsKeys.next().toString()));
        }
        recyclerViewAdapter.notifyDataSetChanged();
    }
    /*
    public void removeAt(int position) {
        //mDataset.remove(position);
        RecyclernotifyItemRemoved(position);
        notifyItemRangeChanged(position, mDataSet.size());

    }
*/
}