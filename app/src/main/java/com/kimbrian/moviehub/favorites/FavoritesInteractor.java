package com.kimbrian.moviehub.favorites;

import com.kimbrian.moviehub.Movie;

import java.util.List;

public interface FavoritesInteractor {
    void setFavorite(Movie movie);

    boolean isFavorite(String id);

    List<Movie> getFavorites();

    void unFavorite(String id);
}
