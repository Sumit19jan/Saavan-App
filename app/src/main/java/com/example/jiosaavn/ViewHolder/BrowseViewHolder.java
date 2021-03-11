package com.example.jiosaavn.ViewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jiosaavn.R;

public class BrowseViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvBrowseCard;

    public BrowseViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvBrowseCard = itemView.findViewById(R.id.ivBrowseCard);
    }

    public void setData() {

    }
}
