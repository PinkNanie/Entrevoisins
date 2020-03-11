package com.openclassrooms.entrevoisins.service;

import android.support.v4.app.NotificationCompatSideChannelService;
import android.view.View;

import com.openclassrooms.entrevoisins.model.DetailsNeighbour_activity;
import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;


/**
 * Neighbour API client
 */
public interface NeighbourApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Neighbour> getNeighbours();

    /**
     * Deletes a neighbour
     * @param neighbour
     */
    void deleteNeighbour(Neighbour neighbour);

    /**
     * Create a neighbour
     * @param neighbour
     */
    void createNeighbour(Neighbour neighbour);

    /**
     * Do a Neighbour.isFavorite
     * @param isFavorite
     */

    void setNeighbourFavorite (boolean isFavorite);
}
