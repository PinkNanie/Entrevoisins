package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.bluetooth.le.ScanSettings;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class ListNeighbourPagerAdapter extends FragmentPagerAdapter {


    public ListNeighbourPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * getItem is called to instantiate the fragment for the given page.
     * @param position
     * @return
     */




    @Override
    public Fragment getItem(int position) {
        Fragment fm = null;
        Bundle bundle;
        switch (position){
            case 0:

                bundle = new Bundle();
                bundle.putString("datas", "Neighbours");
                fm = new NeighbourFragment();
                fm.setArguments(bundle);
                break;

            case 1:

                bundle = new Bundle();
                bundle.putString("datas", "Favorites");
                fm = new NeighbourFragment();
                fm.setArguments(bundle);
                break;
        }
        return fm;
    }

    /**
     * get the number of pages
     * @return
     */
    @Override
    public int getCount() {
        return 2;
    }
}