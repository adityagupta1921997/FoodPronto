package com.apkglobal.foodpronto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import fr.ganfra.materialspinner.MaterialSpinner;

public class GifActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    ImageView forwardarrow;
    MaterialSpinner spinner;
    String[] time={"BreakFast","Lunch","Dinner","Snacks"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        spinner=findViewById(R.id.sp1);
        spinner.setOnItemSelectedListener(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to hide the action bar
        getSupportActionBar().hide();
        forwardarrow=findViewById(R.id.forward_arrow);
        forwardarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu=new Intent(GifActivity.this,MenuActivity.class);
                startActivity(menu);
            }
        });
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,time);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
