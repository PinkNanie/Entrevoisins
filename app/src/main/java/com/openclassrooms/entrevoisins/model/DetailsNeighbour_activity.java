package com.openclassrooms.entrevoisins.model;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.ui.neighbour_list.FavListFragment;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;


public class DetailsNeighbour_activity extends AppCompatActivity {

    ListNeighbourActivity mListneighbouractivity;
    FavListFragment mFavListFragment
   Neighbour mNeighbour;
   private ImageView mProfilePicture;
   private ImageButton mReturnBtn;
   private TextView mFirstname;
   private ImageButton mFavoriteBtn;
   private TextView mInfos;
   private TextView mBiography;



    private ImageView getmProfilePicture(String) {

        mNeighbour.getAvatarUrl();

        return mProfilePicture ;}

    public TextView getmFirstname (String) {

       mNeighbour.getName();

        return mFirstname ;
    }

    public TextView getmInfos (String,String) {

       mNeighbour.getAddress(),
       mNeighbour.getPhoneNumber();

        return mInfos;
    }

    public TextView mBiography(String) {

        mNeighbour.getAboutMe();

        return mBiography;}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_neighbour);

        mProfilePicture = (ImageView) findViewById(R.id.profile_picture);
        mReturnBtn = (ImageButton) findViewById(R.id.return_btn);
        mFirstname = (TextView) findViewById(R.id.firstname);
        mFavoriteBtn = (ImageButton) findViewById(R.id.favorite_btn);
        mInfos = (TextView) findViewById(R.id.infos);
        mBiography = (TextView) findViewById(R.id.biography);

        mReturnBtn.setEnabled(true);
        mFavoriteBtn.setEnabled(true);

        mFavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Neighbour.add.FavListFragment;
            }
        });


        mReturnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return mListneighbouractivity;
            }
        });
    }
}
