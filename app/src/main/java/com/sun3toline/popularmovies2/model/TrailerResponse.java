package com.sun3toline.popularmovies2.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by AchmadF on 7/30/2017.
 */

public class TrailerResponse {
    @SerializedName("id")
    private int id_trailer;
    @SerializedName("results")
    private List<Trailer> results;

    public int getIdTrailer(){
        return id_trailer;
    }

    public void seIdTrailer(int id_trailer){
        this.id_trailer = id_trailer;
    }

    public List<Trailer> getResults(){
        return results;
    }
}
