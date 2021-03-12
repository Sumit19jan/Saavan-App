package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WomensWorldAdapter extends RecyclerView.Adapter<WomenWorldViewHolder> {
    private List<WomenWorldModelClass> womenWorldModelClassList;

    public WomensWorldAdapter(List<WomenWorldModelClass> womenWorldModelClassList) {
        this.womenWorldModelClassList = womenWorldModelClassList;
    }

    @NonNull
    @Override
    public WomenWorldViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.womens_world_item_layout,parent,false);
        return new WomenWorldViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WomenWorldViewHolder holder, int position) {
        WomenWorldModelClass womenWorldModelClass = womenWorldModelClassList.get(position);
        holder.setWomensData(womenWorldModelClass);
    }

    @Override
    public int getItemCount() {
        return womenWorldModelClassList.size();
    }
}
