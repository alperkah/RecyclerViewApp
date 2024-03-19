package com.hmyo.recyvclerviewapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hmyo.recyvclerviewapp.adapter.MyAdapter;
import com.hmyo.recyvclerviewapp.model.ListItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        ListItem item1 = new ListItem("Titanic","Romantik drama","IMDB 9") ;
        listItems.add(item1);
        ListItem item2 = new ListItem("Matrix","Bilim kurgu","IMDB 10") ;
        listItems.add(item2);
        ListItem item3 = new ListItem("Avatar","Fantastik","IMDB 9") ;
        listItems.add(item3);
        ListItem item4 = new ListItem("Godfather","Dram","IMDB 10") ;
        listItems.add(item4);



        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);






    }
}