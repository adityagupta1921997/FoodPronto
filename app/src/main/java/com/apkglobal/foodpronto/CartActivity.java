package com.apkglobal.foodpronto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Cart cart;
    Button placeorder;

    CartAdapter cartAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        recyclerView=findViewById(R.id.recyclerview2);
        placeorder=findViewById(R.id.btn_order);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        List<Configure> conflist=cart.getConfigureList();
        cartAdapter=new CartAdapter(conflist);
        recyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();
        placeorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Do Payment",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
