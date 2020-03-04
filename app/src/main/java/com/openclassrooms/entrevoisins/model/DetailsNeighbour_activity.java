package com.openclassrooms.entrevoisins.model;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;

public class DetailsNeighbour_activity extends AppCompatActivity {

   private ImageView mProfilePicture ;
   private Button mReturneBtn ;
   private TextView mFirstname ;
   private Button mFavoritesBtn ;
   private TextView mInfos ;
   private TextView mBiography ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_neighbour);

        mProfilePicture = Neighbour.avatarUrl;

    }
}
