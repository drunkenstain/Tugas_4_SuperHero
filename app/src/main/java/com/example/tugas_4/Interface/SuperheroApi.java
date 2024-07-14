package com.example.tugas_4.Interface;

import com.example.tugas_4.Model.SuperheroResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SuperheroApi {
    @GET("api/{access_token}/search/{name}")
    Call<SuperheroResponse> searchSuperhero(@Path("access_token") String accessToken, @Path("name") String name);
}
