package com.example.saavn_app_praneeth.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.saavn_app_praneeth.R;
import com.example.saavn_app_praneeth.Response.ResultsItem;

public class MalayalamViewHolder extends RecyclerView.ViewHolder {

    private ImageView IvSongImage;
    private TextView tvTitle;
    private ConstraintLayout ConstraintContainer;

    public MalayalamViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        IvSongImage=itemView.findViewById(R.id.ivMalayalamSongs);
        tvTitle=itemView.findViewById(R.id.tvMalayalamSongsTitle);
        ConstraintContainer=itemView.findViewById(R.id.malayalamSongsContainer);
    }
    public void setData(ResultsItem resultsItem) {
        if(resultsItem.getArtworkUrl100()!=null){
            Glide.with(IvSongImage).load(resultsItem.getArtworkUrl100()).into(IvSongImage);}
        else
        { Glide.with(IvSongImage).load(R.drawable.saavn1).into(IvSongImage);}
        tvTitle.setText(resultsItem.getTrackName());
    }
}
