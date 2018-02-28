package com.apkglobal.foodpronto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayank on 2/28/2018.
 */

public class Cart {

    public static List<Configure> configureList;

    public static List<Configure> getConfigureList() {
        return configureList;
    }

    public static void setConfigureList(List<Configure> configureList) {
        Cart.configureList = configureList;
    }
}
