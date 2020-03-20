package com.openclassrooms.entrevoisins.service;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ListFragment;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }

    /**
     * {@inheritDoc}
     *
     * @param neighbour
     */
    @Override
    public void createNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public List<Neighbour> getNeighboursFavorite() {

        List<Neighbour> neighboursFavorite = new ArrayList<>();

        for (Neighbour neighbour : neighbours){
            if (neighbour.isFavorite()) {
                neighboursFavorite.add(neighbour);
            }
        }
        return neighboursFavorite;
    }

    @Override
    public void reverseNeighbour(Neighbour neighbour) {

}


