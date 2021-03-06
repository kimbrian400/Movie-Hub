package com.kimbrian.moviehub.details;

import com.kimbrian.moviehub.Review;
import com.kimbrian.moviehub.ReviewsWrapper;
import com.kimbrian.moviehub.Video;
import com.kimbrian.moviehub.VideoWrapper;
import com.kimbrian.moviehub.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
