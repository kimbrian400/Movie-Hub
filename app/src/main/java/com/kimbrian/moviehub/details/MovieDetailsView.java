package com.kimbrian.moviehub.details;

import com.kimbrian.moviehub.Movie;
import com.kimbrian.moviehub.Review;
import com.kimbrian.moviehub.Video;

import java.util.List;

interface MovieDetailsView {
    void showDetails(Movie movie);

    void showTrailers(List<Video> trailers);

    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
