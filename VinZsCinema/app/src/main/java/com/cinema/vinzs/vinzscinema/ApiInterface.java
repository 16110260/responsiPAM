package com.cinema.vinzs.vinzscinema;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    public static String DB_API = "b734b448beb00df19a2f410f3ff51572";

    @GET("now_playing?api_key=" + DB_API)
    Call<Movie> getPlaying();

}
