package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private isFavorite  mFavNeighbour;
    private NeighbourApiService mApiService;



    public FavListFragment() {
        // Required empty public constructor


    }


    // TODO: Rename and change types and number of parameters
    public static FavListFragment newInstance() {
        FavListFragment fragment = new FavListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApiService.setNeighbourFavorite(boolean isFavorite);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fav_list, container, false);
        Context context = view.getContext();
        mRecyclerView = (RecyclerView) view;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        mRecyclerView.addItemDecoration ( new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        return view;
    }

    private void initlist(){
        mFavNeighbour = mApiService.setNeighbourFavorite(boolean isFavorite);
        mRecyclerView.setAdapter(new MyNeighbourRecyclerViewAdapter(mFavNeighbour));
    }

    public void onResume(){
        super.onResume();
        initlist();
    }

}
