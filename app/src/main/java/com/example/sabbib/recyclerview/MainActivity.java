package com.example.sabbib.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView view;
    private RecyclerView.Adapter adapter;

    List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (RecyclerView) findViewById(R.id.rView);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        adapter = new TestAdapter(listItems, this);
        view.setAdapter(adapter);

        preparedData();
    }

    private void preparedData(){
        listItems.add(new ListItem("My Devices", "Device Info"));
        listItems.add(new ListItem("My Profile", "Profile Info"));
        listItems.add(new ListItem("Support", "Assisting you"));
        listItems.add(new ListItem("Six Week Sleep Challenge", "Sleep Coach"));
        listItems.add(new ListItem("Privacy Policy", "Our secret"));
        listItems.add(new ListItem("Terms of Service", "The do's and don'ts"));
    }
}
