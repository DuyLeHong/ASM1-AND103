package com.duyle.asm1;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface APIService {

    String DOMAIN = "http://10.82.1.44:3000/";

    @GET("/api/list")
    Call<List<CarModel>> getCars();

    @POST("/api/add_xe")
    Call<List<CarModel>> addXe(@Body CarModel xe);

    @DELETE("/api/xoa_xe/{id}")
    Call<List<CarModel>> xoaXe(@Path("id") String id); // restful api

    @PUT("/api/update_xe")
    Call<List<CarModel>> updateXe(@Body CarModel car);
}
