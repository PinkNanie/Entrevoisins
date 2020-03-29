package com.openclassrooms.entrevoisins.ui;



import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;
import com.openclassrooms.entrevoisins.ui.neighbour_list.MyNeighbourRecyclerViewAdapter;


import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.openclassrooms.entrevoisins.R.layout.activity_details_neighbour;


public class DetailsNeighbour_activity extends AppCompatActivity implements View.OnClickListener {

    Neighbour mNeighbour;
    NeighbourApiService mApiService;

    @BindView(R.id.profile_picture)
    public ImageView mProfilePicture;
    @BindView(R.id.return_btn)
    public ImageButton mReturnBtn;
    @BindView(R.id.firstname)
    public TextView mFirstname;
    @BindView(R.id.favorite_btn)
    public ImageButton mFavoriteBtn;
    @BindView(R.id.infos)
    public TextView mInfos;
    @BindView(R.id.biography)
    public TextView mBiography;
    private String Infos = mNeighbour.getAddress() + mNeighbour.getPhoneNumber();




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_details_neighbour);
        ButterKnife.bind(this);
        getActionBar().hide();


        showDetails();
    }


        private void showDetails() {


            Glide.with(this).load(mNeighbour.getAvatarUrl()).into(mProfilePicture);
            mFirstname.setText(mNeighbour.getName());
            mInfos.setText(Infos);
            mBiography.setText(mNeighbour.getAboutMe());

            mReturnBtn.setOnClickListener(v -> finish());
        }


    @Override
    public void onClick(View v) {

               mFavoriteBtn.setOnClickListener(view -> {

                   mNeighbour.setFavorite(!mNeighbour.isFavorite());
                   mApiService.reverseNeighbour(mNeighbour);


        });



    }

}



