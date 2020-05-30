package com.dheeyi.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.dheeyi.recyclerview.Adpater.RVAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<Integer> imagesID = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitMaps();
        initRecyclerView();
    }

    public void initImageBitMaps() {
        imagesID.add(R.drawable.sp); imagesName.add("Spotify");
        imagesID.add(R.drawable.fb); imagesName.add("Facebook");
        imagesID.add(R.drawable.dl); imagesName.add("Duolingo");
        imagesID.add(R.drawable.mg); imagesName.add("Messenger");
        imagesID.add(R.drawable.sc); imagesName.add("SnapChat");
        imagesID.add(R.drawable.tw); imagesName.add("Twitter");
    }

    public void initRecyclerView() {
        recyclerView = findViewById(R.id.rvContainer);
        rvAdapter = new RVAdapter(this, imagesName, imagesID);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}