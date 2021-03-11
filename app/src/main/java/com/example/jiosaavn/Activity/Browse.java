package com.example.jiosaavn.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jiosaavn.R;

public class Browse extends AppCompatActivity {

    private TextView mTvBrowse;
    private Button mBtnNewRelease;
    private Button mBtnTopCharts;
    private Button mBtnRadioStation;
    private EditText mEtFindMood;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        initViews();
    }

    private void initViews() {
        mTvBrowse = findViewById(R.id.tvBrowse);
        mBtnNewRelease = findViewById(R.id.btnNewRelease);
        mBtnTopCharts = findViewById(R.id.btnTopCharts);
        mBtnRadioStation = findViewById(R.id.btnRadio);
        mEtFindMood = findViewById(R.id.etFindMood);
        mRecyclerView = findViewById(R.id.recyclerView);
    }
}