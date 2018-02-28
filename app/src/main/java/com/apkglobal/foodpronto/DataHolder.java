package com.apkglobal.foodpronto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class DataHolder extends Fragment {
    private RecyclerView mRecyclerView;

    private List<Model> mDatas;
    private static final String ARG_TITLE = "title";
    private String mTitle;
    Configure configure=new Configure();
    private final String[] Indian = {"SouthIndian", "SouthIndian", "SouthIndian", "SouthIndian"};
    private final int[] Indian_images = {R.drawable.lu1, R.drawable.br1, R.drawable.di1, R.drawable.lu2};
    public final String[] Indian_calories={"100","200","300","400"};
    private final String[] French = {"FrenchNorth", "FrenchNorth", "FrenchNorth"};
    private final int[] French_images = {R.drawable.lu1, R.drawable.br1, R.drawable.di1};
    public final String[] French_calories={"100","200","300"};
    private final String[] Japanese = {"Japanese", "Japanese", "Japanese", "Japanese", "Japanese"};
    public final String[] Japanese_calories={"100","200","300","400","500"};
    private final int[] Japanese_images = {R.drawable.lu1, R.drawable.br1, R.drawable.di1, R.drawable.lu2,R.drawable.lu3};
    private final String[] American = {"American", "American", "American", "American", "American", "American"};
    public final String[] American_calories={"100","200","300","400","500","600"};
    private final int[] American_images = {R.drawable.lu1, R.drawable.br1, R.drawable.di1, R.drawable.lu2,R.drawable.di2,R.drawable.br3};

    public static DataHolder getInstance(String title) {
        DataHolder fra = new DataHolder();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_TITLE, title);
        fra.setArguments(bundle);
        return fra;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        mTitle = bundle.getString(ARG_TITLE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.data_holder, container, false);

        initData();
        mRecyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new GridLayoutManager(mRecyclerView.getContext(),2));
        mRecyclerView.setAdapter(new RecyclerAdapter(mRecyclerView.getContext(), mDatas));

        return v;
    }

    private void initData() {
        mDatas = new ArrayList<>();
        if (mTitle.equals("Indian")) {
            for (int i = 0; i < Indian.length; i++) {

                mDatas.add(new Model(Indian[i], Indian_images[i],Indian_calories[i]));
            }
        }
        else if(mTitle.equals("French"))
        {
            for (int i = 0; i < French.length; i++) {

                mDatas.add(new Model(French[i], French_images[i],French_calories[i]));
            }
        }
        else if(mTitle.equals("Japanese"))
        {
            for (int i = 0; i < Japanese.length; i++) {

                mDatas.add(new Model(Japanese[i], Japanese_images[i],Japanese_calories[i]));
            }
        }
        else if(mTitle.equals("American"))
        {
            for (int i = 0; i < American.length; i++) {

                mDatas.add(new Model(American[i], American_images[i],American_calories[i]));
            }
        }
    }
}

