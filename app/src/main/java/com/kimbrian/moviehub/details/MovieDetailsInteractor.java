package com.kimbrian.moviehub.details;

import com.kimbrian.moviehub.Review;
import com.kimbrian.moviehub.Video;

import java.util.List;

import io.reactivex.Observable;

public interface MovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);

    Observable<List<Review>> getReviews(String id);
}
