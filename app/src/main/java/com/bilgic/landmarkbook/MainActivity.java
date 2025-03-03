package com.bilgic.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import android.view.View;
import com.bilgic.landmarkbook.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.bilgic.landmarkbook.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayList<Landmark> landmarkArrayList = new ArrayList<>();
        landmarkArrayList.add(new Landmark("Pisa", "Italy", R.drawable.pisa));
        landmarkArrayList.add(new Landmark("Eiffel", "France", R.drawable.eiffel));
        landmarkArrayList.add(new Landmark("Colosseum", "Italy", R.drawable.colosseum));
        landmarkArrayList.add(new Landmark("London Bridge", "UK", R.drawable.londonbridge));

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
    }
}
