package com.bilgic.landmarkbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bilgic.landmarkbook.databinding.RecyclerRowBinding;
import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    private final ArrayList<Landmark> landmarkList;

    public LandmarkAdapter(ArrayList<Landmark> landmarkList) {
        this.landmarkList = landmarkList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandmarkHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {
        Landmark landmark = landmarkList.get(position);
        holder.binding.recyclerViewTextView.setText(landmark.getName());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
            Singleton.getInstance().setSelectedLandmark(landmark);
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return landmarkList.size();
    }

    public static class LandmarkHolder extends RecyclerView.ViewHolder {
        private final RecyclerRowBinding binding;

        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
