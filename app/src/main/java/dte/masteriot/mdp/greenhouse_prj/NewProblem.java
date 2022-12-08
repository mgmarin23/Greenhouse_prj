package dte.masteriot.mdp.greenhouse_prj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class NewProblem extends AppCompatActivity {

    Button btn_ok, btn_cancel;
    List<Item> ProblemList;
    EditText p_name, p_image;

    MyApplication myApplication = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_problem);

        btn_ok = findViewById(R.id.btn_pok);
        btn_cancel = findViewById(R.id.btn_pcancel);
        p_name = findViewById(R.id.p_name);
        p_image = findViewById(R.id.p_image);
    }

    public void POK(View view){
        ProblemList = myApplication.getListofitems();
        Long nextId = myApplication.getNextId();
        Item newProblem = new Item(p_name.getText().toString(), "",0, nextId, 0,true);

        ProblemList.add(newProblem);
        myApplication.setNextId(nextId++);

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}