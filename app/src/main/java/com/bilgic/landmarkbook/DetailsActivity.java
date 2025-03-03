package com.bilgic.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.bilgic.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Landmark selectedLandmark = Singleton.getInstance().getSelectedLandmark();

        if (selectedLandmark != null) {
            binding.nameText.setText(selectedLandmark.getName());
            binding.countryText.setText(selectedLandmark.getCountry());
            binding.imageView.setImageResource(selectedLandmark.getImage());
        }
    }
}
