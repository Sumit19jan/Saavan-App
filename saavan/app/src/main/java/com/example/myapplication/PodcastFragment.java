package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PodcastFragment extends Fragment {

    private ImageView mIvAllCategoriesImage;
    private ImageView mIvJioSaavanSelectImage;
    private ImageView mIvTendingNowImage;
    private TextView mTvFeaturedPodCasts;
    private RecyclerView mRvFeaturedPodCasts;
    private List<FeaturedPodcatsModelClass> featuredPodcatsModelClassList = new ArrayList<>();
    private TextView mTvWomensOfTheWorld;
    private RecyclerView mRvWomenOfTheWorld;
    private List<WomenWorldModelClass> womenWorldModelClassList = new ArrayList<>();
    private TextView mTvJioSaavnOriginals;
    private List<JioSaavnOriginalsModelClass> jioSaavnOriginalsModelClassList = new ArrayList<>();
    private RecyclerView mRvJioSaavnOriginals;
    private RecyclerView mRvHotTopics;
    private TextView mTvHotTopics;
    private List<HotTopicsModelClass> hotTopicsModelClassList = new ArrayList<>();
    private List<MadeInIndiaModelClass> madeInIndiaModelClassArrayList = new ArrayList<>();
    private TextView mTvMadeInIndia;
    private RecyclerView mRvMadeInIndia;

    public PodcastFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_podcast, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewsAndListeners(view);
        setFeaturedData();
        setDataWomensWorld();
        setJioSaavnOriginalsData();
        setHotTopicsData();
        setMadeInIndiaData();
        setFeaturedAdapter();
        setWomensWorldAdapter();
        setJioSaavnOriginalAdapter();
        setHotTopicsAdapter();
        setMadeInIndiaAdapter();
    }

    private void setMadeInIndiaAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        MadeInIndiaAdapter madeInIndiaAdapter = new MadeInIndiaAdapter(madeInIndiaModelClassArrayList);
        mRvMadeInIndia.setLayoutManager(linearLayoutManager);
        mRvMadeInIndia.setAdapter(madeInIndiaAdapter);
    }

    private void setMadeInIndiaData() {
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.panno));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.no_new));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.unkut_kritika));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.ranveer));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.filmy_pyar));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.noir));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.syco));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.filmy_pyar));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.made_in_india));
        madeInIndiaModelClassArrayList.add(new MadeInIndiaModelClass(R.drawable.telgu_cinema_proj));
    }


    private void setHotTopicsAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        HotTopicsAdapter hotTopicsAdapter = new HotTopicsAdapter(hotTopicsModelClassList);
        mRvHotTopics.setLayoutManager(linearLayoutManager);
        mRvHotTopics.setAdapter(hotTopicsAdapter);
    }

    private void setHotTopicsData() {
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.frigth));
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.business));
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.religion));
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.flim));
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.sportss));
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.politics));
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.health));
        hotTopicsModelClassList.add(new HotTopicsModelClass(R.drawable.comedy));
    }

    private void setJioSaavnOriginalAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        JioSaavnOriginalsAdapter jioSaavnOriginalsAdapter = new JioSaavnOriginalsAdapter(jioSaavnOriginalsModelClassList);
        mRvJioSaavnOriginals.setLayoutManager(linearLayoutManager);
        mRvJioSaavnOriginals.setAdapter(jioSaavnOriginalsAdapter);
    }

    private void setJioSaavnOriginalsData() {
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.newyourk));
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.holestic));
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.bhai));
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.jilebi));
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.five_minute));
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.news));
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.tumhe));
        jioSaavnOriginalsModelClassList.add(new JioSaavnOriginalsModelClass(R.drawable.britis));
    }

    private void setWomensWorldAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        WomensWorldAdapter womensWorldAdapter = new WomensWorldAdapter(womenWorldModelClassList);
        mRvWomenOfTheWorld.setLayoutManager(linearLayoutManager);
        mRvWomenOfTheWorld.setAdapter(womensWorldAdapter);
    }

    private void setDataWomensWorld() {
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.chiming_supermom));
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.wo_kaun_thii));
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.made_in_india));
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.durga));
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.she_worrier));
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.child));
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.main_bhi));
        womenWorldModelClassList.add(new WomenWorldModelClass(R.drawable.work_life_india));
    }

    private void setFeaturedData() {
        featuredPodcatsModelClassList.add(new FeaturedPodcatsModelClass(R.drawable.mile_ho_tum));
        featuredPodcatsModelClassList.add(new FeaturedPodcatsModelClass(R.drawable.global_news));
        featuredPodcatsModelClassList.add(new FeaturedPodcatsModelClass(R.drawable.bhagvad_gita));
        featuredPodcatsModelClassList.add(new FeaturedPodcatsModelClass(R.drawable.zara_khauuff));
        featuredPodcatsModelClassList.add(new FeaturedPodcatsModelClass(R.drawable.view));
    }

    private void setFeaturedAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        FeaturedPodcatsAdapter featuredPodcatsAdapter = new FeaturedPodcatsAdapter(featuredPodcatsModelClassList);
        mRvFeaturedPodCasts.setLayoutManager(linearLayoutManager);
        mRvFeaturedPodCasts.setAdapter(featuredPodcatsAdapter);
    }

    private void initViewsAndListeners(View view) {
        mIvAllCategoriesImage = view.findViewById(R.id.ivAllCategoriesImage);
        mIvJioSaavanSelectImage = view.findViewById(R.id.ivJioSaavanSelectImageImage);
        mIvTendingNowImage = view.findViewById(R.id.ivTendingNowImage);
        mTvFeaturedPodCasts = view.findViewById(R.id.tvFeaturedPodCasts);
        mRvFeaturedPodCasts = view.findViewById(R.id.rvFeaturedPodCasts);
        mTvWomensOfTheWorld = view.findViewById(R.id.tvWomensOfTheWorld);
        mRvWomenOfTheWorld = view.findViewById(R.id.rvWomenOfTheWorld);
        mTvJioSaavnOriginals = view.findViewById(R.id.tvJioSaavnOriginals);
        mRvJioSaavnOriginals = view.findViewById(R.id.rvJioSaavnOriginals);
        mTvHotTopics = view.findViewById(R.id.tvHotTopics);
        mRvHotTopics = view.findViewById(R.id.rvHotTopics);
        mTvMadeInIndia = view.findViewById(R.id.tvMadeInIndia);
        mRvMadeInIndia = view.findViewById(R.id.rvMadeInIndia);
    }
}