package dte.masteriot.mdp.greenhouse_prj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class NewIdea extends AppCompatActivity {

    Button btn_ok, btn_cancel;
    List<Ideas> IdeaList;
    EditText i_name, i_link, i_description;
    private long y;

    MyApplication myApplication = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_idea);


        btn_ok = findViewById(R.id.btn_pok);
        btn_cancel = findViewById(R.id.btn_pcancel);
        i_name = findViewById(R.id.i_name);
        i_link = findViewById(R.id.i_link);
        i_description = findViewById(R.id.i_description);

        Intent inputIntent = getIntent();
        y = inputIntent.getLongExtra("key", 0);
    }

    public void IOK(View view){
        IdeaList = myApplication.getFetchData();
        Long nextIdea = myApplication.getNextIdea();
        Ideas newIdea = new Ideas(nextIdea,i_name.getText().toString(), y, i_description.getText().toString(), i_link.getText().toString(), false,false);


        IdeaList.add(newIdea);
        myApplication.setNextId(nextIdea++);

        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}