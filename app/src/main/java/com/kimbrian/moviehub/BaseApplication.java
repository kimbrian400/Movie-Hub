package com.kimbrian.moviehub;

import android.app.Application;
import android.os.StrictMode;

import com.kimbrian.moviehub.AppComponent;
import com.kimbrian.moviehub.AppModule;
import com.kimbrian.moviehub.DaggerAppComponent;
import com.kimbrian.moviehub.details.DetailsComponent;
import com.kimbrian.moviehub.details.DetailsModule;
import com.kimbrian.moviehub.favorites.FavoritesModule;
import com.kimbrian.moviehub.listing.ListingComponent;
import com.kimbrian.moviehub.listing.ListingModule;
import com.kimbrian.moviehub.network.NetworkModule;

import io.realm.Realm;

public class BaseApplication extends Application {
    private AppComponent appComponent;
    private DetailsComponent detailsComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.enableDefaults();
        initRealm();
        appComponent = createAppComponent();
    }

    private AppComponent createAppComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .favoritesModule(new FavoritesModule())
                .build();
    }

    private void initRealm() {
        Realm.init(this);
    }

    public DetailsComponent createDetailsComponent() {
        detailsComponent = appComponent.plus(new DetailsModule());
        return detailsComponent;
    }

    public void releaseDetailsComponent() {
        detailsComponent = null;
    }

    public ListingComponent createListingComponent() {
        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public void releaseListingComponent() {
        listingComponent = null;
    }

    public ListingComponent getListingComponent() {
        return listingComponent;
    }
}
