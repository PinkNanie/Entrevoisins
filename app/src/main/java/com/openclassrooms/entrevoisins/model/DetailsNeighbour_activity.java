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
import butterknife.BindView;

public class DetailsNeighbour_activity extends AppCompatActivity implements View.OnClickListener {

    private OnButtonClickedListener mCallback;
    ListNeighbourActivity mListNeighbouractivity;
    FavListFragment mFavListFragment;
    Neighbour mNeighbour;

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

    public interface OnButtonClickedListener {
        public void onButtonClicked(View view);
    }


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
            public void onClick(View v)
        });


        mReturnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return mListNeighbouractivity;
            }
        });
    }
}
