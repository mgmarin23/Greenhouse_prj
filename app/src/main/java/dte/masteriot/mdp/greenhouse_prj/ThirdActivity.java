package dte.masteriot.mdp.greenhouse_prj;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import dte.masteriot.mdp.greenhouse_prj.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {

    //private AppBarConfiguration appBarConfiguration;
    //private ActivityThirdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //binding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_third);

        /*
        tv = findViewById(R.id.textView);

        // Get the text to be shown from the calling intent and set it in the layout
        Intent inputIntent = getIntent();
        String inputText = inputIntent.getStringExtra("text");
        tv.setText(inputText);
        */

/*
        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_third);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }
}