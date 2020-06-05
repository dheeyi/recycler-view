package com.dheeyi.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.dheeyi.recyclerview.Adpater.RVAdapter;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURL = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitMaps();
        initRecyclerView();
    }

    public void initImageBitMaps() {
        String imgURL = "VlGGqmG,DWX6eGn,EpmxiT3,V9Pcw5j,HkEJ5K4,DaXpXsG,0IRvKpq,XUZw40U,mjR9oaO";
        String imgNam = "Whastapp,Twitter,Youtube,Snapchat,Instagram,Google+,Pinterest,LinkedIN,Facebook";
        imagesURL.addAll(Arrays.asList(imgURL.split(",")));
        imagesName.addAll(Arrays.asList(imgNam.split(",")));
    }

    public void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.rvContainer);
        RVAdapter rvAdapter = new RVAdapter(this, imagesName, imagesURL);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}