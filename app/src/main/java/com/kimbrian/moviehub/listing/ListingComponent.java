package com.kimbrian.moviehub.listing;

import com.kimbrian.moviehub.listing.sorting.SortingDialogFragment;
import com.kimbrian.moviehub.listing.sorting.SortingModule;

import dagger.Subcomponent;

@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
