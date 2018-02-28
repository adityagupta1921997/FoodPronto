package com.apkglobal.foodpronto;

/**
 * Created by Mayank on 2/28/2018.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder> {

    private List<Configure> cList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView iname, quantity,calories;
        ImageView removeitem;

        public MyViewHolder(View view) {
            super(view);
            iname = (TextView) view.findViewById(R.id.item_name2);
            quantity = (TextView) view.findViewById(R.id.item_quantity);
            calories=view.findViewById(R.id.item_calorie);
            removeitem=view.findViewById(R.id.remove_item);
        }
    }


    public CartAdapter(List<Configure> cList) {
        this.cList = cList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cart_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Configure conf = cList.get(position);
        holder.iname.setText("Item name: "+conf.getItem_name());
        holder.quantity.setText("Category: "+String.valueOf(conf.getItem_quantity()));
        holder.calories.setText("Calories: "+conf.getItem_calories());
        holder.removeitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return cList.size();
    }
}
