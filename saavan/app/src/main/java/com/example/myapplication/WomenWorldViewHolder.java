package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WomenWorldViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvWoemensWorldImages;

    public WomenWorldViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvWoemensWorldImages = itemView.findViewById(R.id.ivWomensWorldImages);
    }

    public void setWomensData(WomenWorldModelClass womenWorldModelClass) {
        mIvWoemensWorldImages.setImageResource(womenWorldModelClass.getImage());
    }
}
