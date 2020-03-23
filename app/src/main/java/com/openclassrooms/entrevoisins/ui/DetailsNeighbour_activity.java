package com.openclassrooms.entrevoisins.ui.neighbour_list;


import android.content.Context;
import android.os.Bundle;
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

import butterknife.BindView;

public class DetailsNeighbour_activity extends AppCompatActivity implements View.OnClickListener {


     private OnButtonClickedListener mCallback;


    ListNeighbourActivity mListNeighbouractivity;
    FavListFragment mFavListFragment;
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

    public interface onButtonClickedListener{
         void onButtonClicked (View view);
    }

    protected View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View result = inflater.inflate(R.layout.activity_details_neighbour, container, false);

        result.findViewById(R.id.detailsNeighbour_btn).setOnClickListener(this);

        return result;
    }


    @Override
    public  void onAttach(Context context){
        super.onAttach(context);

        this.createCallbacktoparentActivity();
    }

    @Override
    public void onClick(View v) {
        mReturnBtn.setEnabled(true);
        mFavoriteBtn.setEnabled(true);

        mCallback.onButtonClicked(v);



        mFavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                mApiService.reverseNeighbour(mNeighbour);
            }
        });


        mReturnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return ; /**
                        * retourne à la page précédente
                        */
            }
        });

    }

    private void createCallbacktoparentActivity(){
        try {
            mCallback = (onButtonClickedListener) getCallingActivity();
        } catch (ClassCastException e){
            throw new ClassCastException(e.toString()+"must implement OnButtonClickedListener");
        }
    }
}