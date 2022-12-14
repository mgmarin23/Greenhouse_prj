package dte.masteriot.mdp.greenhouse_prj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "____SecondActivity___";

    MyApplication myApplication = (MyApplication) this.getApplication();

    TextView tv;
    List<Ideas> fetchData = myApplication.getFetchData();
    private static final List<Ideas> fetchData2 = new ArrayList<>();
    private TextView p_name;
    private long y;

    RecyclerView recyclerView2;
    MyAdapter2 recyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        p_name = findViewById(R.id.problem);

        Intent inputIntent = getIntent();
        y = inputIntent.getLongExtra("key", 0);
        String pname = inputIntent.getStringExtra("pname");
        p_name.setText(pname);

        Log.d(TAG, "__Clicked item with position = " + y
                + " and key = " + y);

        //seeCurrentList(y);
        fetchData2.clear();
        long num = 0;
        for(int i=0; i<fetchData.size();i++){
            num++;
            if( fetchData.get(i).getKeyideas() == y) {

                //if (fetchData2.size() <= number){
                //fetchData.remove(i);
                //number++;
                //fetchData2.add(i, fetchData.get(i));
                fetchData2.add(new Ideas(fetchData.get(i).getId(),fetchData.get(i).getName(), fetchData.get(i).getKeyideas(),fetchData.get(i).getDescription(), fetchData.get(i).getLink(),fetchData.get(i).isStar(),fetchData.get(i).isDone()));

            }
        }
        Log.d(TAG, "number of ideas" + num);

        recyclerView2 = findViewById(R.id.rv2);
        recyclerViewAdapter = new MyAdapter2(this, fetchData2);
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

    public void AddNewIdea(View view) {
        Intent intent = new Intent(this, NewIdea.class);
        intent.putExtra("key", y);
        startActivity(intent);
    }
}