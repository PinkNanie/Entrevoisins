package com.openclassrooms.entrevoisins.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;



import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.openclassrooms.entrevoisins.R.layout.activity_details_neighbour;


public class DetailsNeighbour_activity extends AppCompatActivity  {

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
    @BindView(R.id.infos_card_name)
    public TextView mCardName;
    @BindView(R.id.address)
    public TextView mAdress;
    @BindView(R.id.phoneNumber)
    public TextView mPhoneNumber;
    @BindView(R.id.web)
    public TextView mWebpage;
    @BindView(R.id.aboutMe)
    public TextView mBiography;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(activity_details_neighbour);
        ButterKnife.bind(this);

        mApiService = DI.getNeighbourApiService();

        getNeighbour();
        showDetails();
        favorite_btn();

    }



    private void getNeighbour() {
            mNeighbour = getIntent().getParcelableExtra("neighbour");
        }


        private void showDetails() {

            Glide.with(this).load(mNeighbour.getAvatarUrl()).into(mProfilePicture);
            mFirstname.setText(mNeighbour.getName());

            mCardName.setText(mNeighbour.getName());
            mAdress.setText(mNeighbour.getAddress());
            mPhoneNumber.setText(mNeighbour.getPhoneNumber());
            String webpage = "www.facebook.fr/" + mNeighbour.getName();
            mWebpage.setText(webpage);

            mBiography.setText(mNeighbour.getAboutMe());

            mReturnBtn.setOnClickListener(v -> finish());
        }


        private void favorite_btn(){

               mFavoriteBtn.setOnClickListener(v -> {

                   mApiService.reverseNeighbour(mNeighbour);

                   mNeighbour.setFavorite(!mNeighbour.isFavorite());

        });



    }

}



