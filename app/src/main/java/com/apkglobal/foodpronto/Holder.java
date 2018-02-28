package com.apkglobal.foodpronto;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.travijuu.numberpicker.library.NumberPicker;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


/**
 * Created by Mayank on 1/13/2018.
 */

public class Holder extends RecyclerView.ViewHolder {
    TextView skillName,calname;
    private ImageView skillImage;
    Context context;
    PopupWindow popupWindow;
    List<Configure> list=new ArrayList<>();
    Configure configure;
    Cart cart=new Cart();


    public Holder(final View itemView)  {
        super(itemView);
        context=itemView.getContext();

        skillImage=(ImageView)itemView.findViewById(R.id.item_thumbnail);
        skillName=(TextView) itemView.findViewById(R.id.item_name);
        calname=itemView.findViewById(R.id.item_calorie);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

                // Inflate the custom layout/view
                View customView = inflater.inflate(R.layout.dialog_item_details,null);
                popupWindow=new PopupWindow(customView, ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                final TextView item=customView.findViewById(R.id.item_name);
                item.setText(skillName.getText().toString());
                TextView cancel=customView.findViewById(R.id.dialog_exit);
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        popupWindow.dismiss();
                    }
                });
                final NumberPicker numberPicker=customView.findViewById(R.id.number_picker);


                final Button addtocart=customView.findViewById(R.id.btn_cart);
                addtocart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int a=numberPicker.getValue();
                        String i_name=item.getText().toString();
                        String calories=calname.getText().toString();
                        configure=new Configure(i_name,a,calories);
                        list.add(configure);

                        Toast.makeText(context,"Quantity Added: "+a,Toast.LENGTH_SHORT).show();
                        popupWindow.dismiss();
                    }

                });
                popupWindow.showAtLocation(view, Gravity.CENTER,0,0);

                cart.setConfigureList(list);
            }
        });

    }

    public void bindData(Model skillModel)
    {
        skillName.setText(skillModel.name_of_demand);
        skillImage.setImageResource(skillModel.image_of_demand);
        calname.setText(skillModel.calories+"cal");
    }
}
