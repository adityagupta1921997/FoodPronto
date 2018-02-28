package com.apkglobal.foodpronto;


public class Model {
    public String name_of_demand;
    public int image_of_demand;
    public String calories;

    public Model(String name_of_demand, int image_of_demand,String calories) {
        this.name_of_demand = name_of_demand;
        this.image_of_demand = image_of_demand;
        this.calories=calories;
    }
}
