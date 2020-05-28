package com.amanirshad.popularmovies;

import java.io.Serializable;

public class Movies implements Serializable {

    Integer id;
    String posterUrl;
    String backdropUrl;
    String tagline;
    String title;
    String overview;
    Double voteAverage;
    String releaseDate;

    public Movies(Integer id, String posterUrl) {
        this.id = id;
        this.posterUrl = posterUrl;
    }

    public Movies(String poster, String backdrop, String tagline, String title, String overview, Double voteAverage, String releaseDate) {
        this.posterUrl = poster;
        this.backdropUrl = backdrop;
        this.tagline = tagline;
        this.title = title;
        this.overview = overview;
        this.voteAverage = voteAverage;
        this.releaseDate = releaseDate;
    }
}
