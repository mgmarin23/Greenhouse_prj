package dte.masteriot.mdp.greenhouse_prj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.selection.ItemDetailsLookup;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    // Holds references to individual item views
    TextView title;
    TextView subtitle;
    ImageView image;
    ImageView status;

    Context context;
    MyAdapter adapter;

    private static final String TAG = "ListOfItems, MyViewHolder";

    public MyViewHolder(Context ctxt, View itemView, MyAdapter ad) {
        super(itemView);
        context = ctxt;
        title = itemView.findViewById(R.id.title);
        subtitle = itemView.findViewById(R.id.subtitle);
        image = itemView.findViewById(R.id.imageView); //[Mario] You have to add here to select the image when the initialize the list
        // imageView is the name of the XML Layout
        //status = itemView.findViewById(R.id.background);

        adapter = ad;
    }

    void bindValues(Item item, Boolean isSelected) {
        // give values to the elements contained in the item view.
        // formats the title's text color depending on the "isSelected" argument.
        title.setText(item.getTitle());
        subtitle.setText(item.getSubtitle());
        image.setImageResource(item.getImage()); //[Mario] You have to add here to select the image when the initialize the list

        //background.setColor(item.getStatus());

        if(isSelected) {
            title.setTextColor(Color.BLUE);
            //status.setColorFilter(Color.BLUE);
        } else {
            title.setTextColor(Color.BLACK);
        }
    }

    @SuppressLint("LongLogTag")
    @Nullable
    public ItemDetailsLookup.ItemDetails<Long> getItemDetails() {

        Log.d(TAG, "getItemDetails() called");

        // This function returns an ItemDetails object.
        // This object serves, among others, to get the position of the item related to this
        // ViewHolder (by means of the method getPosition()) or to get its selection key
        // (by means of the method getSelectionKey())

        ItemDetailsLookup.ItemDetails<Long> itemDetails = new ItemDetailsLookup.ItemDetails<Long>() {
            @Override
            public int getPosition() {
                // Returns the adapter position of the item.
                Log.d(TAG, "ItemDetailsLookup.ItemDetails<Long>.getPosition() called, will return " + getAbsoluteAdapterPosition());
                return (getAbsoluteAdapterPosition());
            }

            @Nullable
            @Override
            public Long getSelectionKey() {
                Log.d(TAG, "ItemDetailsLookup.ItemDetails<Long>.getSelectionKey() called, will return " + adapter.getKeyAtPosition(getAbsoluteAdapterPosition()));
                return (adapter.getKeyAtPosition(getAbsoluteAdapterPosition()));
            }
        };

        return itemDetails;
    }
}