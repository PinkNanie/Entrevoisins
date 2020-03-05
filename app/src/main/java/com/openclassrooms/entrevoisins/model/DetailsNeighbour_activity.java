package com.openclassrooms.entrevoisins.model;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.service.DummyNeighbourGenerator;


public class DetailsNeighbour_activity extends AppCompatActivity {

   Neighbour mNeighbour;
   private ImageView mProfilePicture;
   private Button mReturnBtn;
   private TextView mFirstname;
   private Button mFavoriteBtn;
   private TextView mInfos;
   private TextView mBiography;



    private ImageView getmProfilePicture(String) {

        mNeighbour.getAvatarUrl();

        return mProfilePicture ;}

    public TextView getmFirstname (String) {

       mNeighbour.getName();

        return mFirstname ;
    }

    public TextView getmInfos (String, String) {

       mNeighbour.getAddress(), mNeighbour.getPhoneNumber();

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
        mReturnBtn = (Button) findViewById(R.id.return_btn);
        mFirstname = (TextView) findViewById(R.id.firstname);
        mFavoriteBtn = (Button) findViewById(R.id.favorite_btn);
        mInfos = (TextView) findViewById(R.id.infos);
        mBiography = (TextView) findViewById(R.id.biography);


    }


}
