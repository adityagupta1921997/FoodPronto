package com.apkglobal.foodpronto;

/**
 * Created by Mayank on 1/14/2018.
 */

public class Configure {

    public String item_name;
    public Integer item_quantity;
    public String item_calories;



    public Configure()
    {

    }

    public Configure(String item_name, Integer item_quantity,String item_calories) {
        this.item_name = item_name;
        this.item_quantity = item_quantity;
        this.item_calories=item_calories;
    }

    public String getItem_calories() {
        return item_calories;
    }

    public void setItem_calories(String item_calories) {
        this.item_calories = item_calories;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Integer getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(Integer item_quantity) {
        this.item_quantity = item_quantity;
    }
}
