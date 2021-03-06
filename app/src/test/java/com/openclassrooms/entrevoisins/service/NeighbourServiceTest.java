package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Unit test on Neighbour service
 */
@RunWith(JUnit4.class)
public class NeighbourServiceTest {

    private NeighbourApiService service;

    @Before
    public void setup() {
        service = DI.getNewInstanceApiService();
    }

    @Test
    public void getNeighboursWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        List<Neighbour> expectedNeighbours = DummyNeighbourGenerator.DUMMY_NEIGHBOURS;
        assertThat(neighbours, IsIterableContainingInAnyOrder.containsInAnyOrder(expectedNeighbours.toArray()));
    }

    @Test
    public void deleteNeighbourWithSuccess() {
        Neighbour neighbourToDelete = service.getNeighbours().get(0);
        service.deleteNeighbour(neighbourToDelete);
        assertFalse(service.getNeighbours().contains(neighbourToDelete));
    }

    @Test
    public void reverseFavoriteWithSuccess() {

        // take first neighbour of Neighbour, who !isFavorite.
        Neighbour neighbour = service.getNeighbours().get(0);

        // it's False, neighbour = !isFavorite.
        assertFalse(service.getNeighbours().get(0).isFavorite());

        // Doing neighbour's Favorite.
         service.reverseNeighbour(neighbour);

        // it's correct neighbour = isFavorite.
         assertTrue(service.getNeighbours().get(0).isFavorite());

    }

    @Test
    public void deleteNeighbourFavoriteWithSuccess(){

        Neighbour neighbourToDelete = service.getNeighboursFavorite().get(0);
        service.deleteNeighbour(neighbourToDelete);

        // it's False, Favorite's List does'nt contain neighbourToDelete
        assertFalse(service.getNeighboursFavorite().contains(neighbourToDelete));

        // it's False, neighbourToDelete isn't contained in all Neighbour's List.
        assertFalse(service.getNeighbours().contains(neighbourToDelete));
    }




}
