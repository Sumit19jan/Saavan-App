package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JioSaavnOriginalsViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvJioSaavnOriginals;

    public JioSaavnOriginalsViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvJioSaavnOriginals = itemView.findViewById(R.id.ivjiosaavnoriginalsImages);
    }

    public void setJioSaavnOriginalsData(JioSaavnOriginalsModelClass jioSaavnOriginalsModelClass) {
        mIvJioSaavnOriginals.setImageResource(jioSaavnOriginalsModelClass.getImage());
    }
}
