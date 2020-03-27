package com.openclassrooms.entrevoisins.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;


import butterknife.BindView;



public class DetailsNeighbour_activity extends AppCompatActivity implements View.OnClickListener {





    ListNeighbourActivity mListNeighbouractivity;
    Neighbour mNeighbour;
    NeighbourApiService mApiService;

    @BindView(R.id.profile_picture)
    ImageView mProfilePicture;
    @BindView(R.id.return_btn)
    ImageButton mReturnBtn;
    @BindView(R.id.firstname)
    TextView mFirstname;
    @BindView(R.id.favorite_btn)
    ImageButton mFavoriteBtn;
    @BindView(R.id.infos)
    TextView mInfos;
    @BindView(R.id.biography)
    TextView mBiography;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onClick(View v) {
        mReturnBtn.setEnabled(true);
        mFavoriteBtn.setEnabled(true);





        mFavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mApiService.reverseNeighbour(mNeighbour);
            }
        });


        mReturnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                  /**
                        * retourne à la page précédente
                        */
            }
        });

    }

}



