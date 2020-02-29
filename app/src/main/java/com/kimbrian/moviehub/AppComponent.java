package com.kimbrian.moviehub;

import com.kimbrian.moviehub.details.DetailsComponent;
import com.kimbrian.moviehub.details.DetailsModule;
import com.kimbrian.moviehub.favorites.FavoritesModule;
import com.kimbrian.moviehub.listing.ListingComponent;
import com.kimbrian.moviehub.listing.ListingModule;
import com.kimbrian.moviehub.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent {
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
