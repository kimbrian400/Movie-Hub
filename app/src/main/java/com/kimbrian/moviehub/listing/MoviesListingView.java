package com.kimbrian.moviehub.listing;

import com.kimbrian.moviehub.Movie;

import java.util.List;

interface MoviesListingView {
    void showMovies(List<Movie> movies);

    void loadingStarted();

    void loadingFailed(String errorMessage);

    void onMovieClicked(Movie movie);
}
