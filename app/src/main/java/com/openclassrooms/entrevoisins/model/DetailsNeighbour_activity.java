package com.openclassrooms.entrevoisins.model;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;

public class DetailsNeighbour_activity extends AppCompatActivity {

    ImageView mProfilePicture;
    Button mReturnBtn;
    TextView mFirstname;
    Button mFavoriteBtn;
    TextView mInfos;
    TextView mBiography;


    public ImageView getmProfilePicture() {
        return mProfilePicture ;
    }

    public TextView getmFirstname() {
        return mFirstname ;
    }

    public TextView getmInfos() {
        return mInfos;
    }

    public TextView getmBiography() {

        return mBiography;
    }

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
