package com.example.jiosaavn.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jiosaavn.Activity.Browse;
import com.example.jiosaavn.R;
import com.example.jiosaavn.ViewHolder.BrowseViewHolder;

import java.util.ArrayList;

public class BrowseAdapter extends RecyclerView.Adapter<BrowseViewHolder> {

    private ArrayList<Browse> browseArrayList;

    @NonNull
    @Override
    public BrowseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new BrowseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BrowseViewHolder holder, int position) {
        Browse browse = browseArrayList.get(position);
        holder.setData();
    }

    @Override
    public int getItemCount() {
        return browseArrayList.size();
    }
}
