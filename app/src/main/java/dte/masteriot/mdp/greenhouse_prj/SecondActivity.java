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

    RecyclerView recyclerView2;
    MyAdapter2 recyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListOfIdeas();

        recyclerView2 = findViewById(R.id.rv2);
        recyclerViewAdapter = new MyAdapter2(this, fetchData);
        recyclerView2.setAdapter(recyclerViewAdapter);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());


        //Intent intent = this.getIntent();
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        //Bundle bundle= intent.getExtras();
        /*
        tv = findViewById(R.id.textView);

        // Get the text to be shown from the calling intent and set it in the layout
        Intent inputIntent = getIntent();
        String inputText = inputIntent.getStringExtra("text");
        tv.setText(inputText);

         */
    }

    private void initListOfIdeas() {

        fetchData.add(new Ideas("a"));
        fetchData.add(new Ideas("b"));
        fetchData.add(new Ideas("c"));
        fetchData.add(new Ideas("d"));
        fetchData.add(new Ideas("e"));
        fetchData.add(new Ideas("f"));
        fetchData.add(new Ideas("g"));
        fetchData.add(new Ideas("h"));
        fetchData.add(new Ideas("i"));
        fetchData.add(new Ideas("j"));
        fetchData.add(new Ideas("k"));
        fetchData.add(new Ideas("l"));
        fetchData.add(new Ideas("m"));
        fetchData.add(new Ideas("n"));
        fetchData.add(new Ideas("ñ"));

    }
}