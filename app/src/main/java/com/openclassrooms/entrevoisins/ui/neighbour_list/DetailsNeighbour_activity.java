package com.openclassrooms.entrevoisins.ui.neighbour_list;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;
import com.openclassrooms.entrevoisins.ui.neighbour_list.FavListFragment;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourActivity;
import butterknife.BindView;

public class DetailsNeighbour_activity extends AppCompatActivity implements View.OnClickListener {

    /**
     * private OnButtonClickedListener mCallback;
     */

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_neighbour);
    }


    @Override
    public void onClick(View v) {
        mReturnBtn.setEnabled(true);
        mFavoriteBtn.setEnabled(true);




        mFavoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                /**
                 * au click du mFavoriteBtn ajouter le Neighbour à isFavorite
                 */
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
}