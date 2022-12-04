package dte.masteriot.mdp.greenhouse_prj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    private static final List<Ideas> fetchData = new ArrayList<>();
    private static final List<Ideas> fetchData2 = new ArrayList<>();

    RecyclerView recyclerView2;
    MyAdapter2 recyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListOfIdeas();
        /*
        Intent inputIntent = getIntent();
        Long x = inputIntent.getLongExtra("key2", 0);
        */
        int x = 2;

        for(int i=0; i<fetchData.size();i++){
            if( fetchData.get(i).getKeyideas() != x) {
                fetchData.remove(i);
            }
        }

        recyclerView2 = findViewById(R.id.rv2);
        recyclerViewAdapter = new MyAdapter2(this, fetchData);
        recyclerView2.setAdapter(recyclerViewAdapter);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());




        //String inputText = inputIntent.getStringExtra("text");
        //tv.setText(x);

        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        //Bundle bundle= intent.getExtras();


        /*
        tv = findViewById(R.id.tv_idea);

        // Get the text to be shown from the calling intent and set it in the layout
        Intent inputIntent = getIntent();
        String inputText = inputIntent.getStringExtra("text");
        tv.setText(inputText);

*/
    }

    private void initListOfIdeas() {

        fetchData.add(new Ideas("a",2));
        fetchData.add(new Ideas("b",2));
        fetchData.add(new Ideas("c",4));
        fetchData.add(new Ideas("d",5));
        fetchData.add(new Ideas("e",4));
        fetchData.add(new Ideas("f",4));
        fetchData.add(new Ideas("g",0));
        fetchData.add(new Ideas("h",0));
        fetchData.add(new Ideas("i",0));
        fetchData.add(new Ideas("j",1));
        fetchData.add(new Ideas("k",1));
        fetchData.add(new Ideas("l",3));
        fetchData.add(new Ideas("m",3));
        fetchData.add(new Ideas("n",5));
        fetchData.add(new Ideas("ñ",2));

    }
}