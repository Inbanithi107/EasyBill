package com.techforge.easybill.ApiInterface;

import com.techforge.easybill.Entity.Bill;
import com.techforge.easybill.Entity.Product;
import com.techforge.easybill.Entity.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/adduser")
    Call<String> saveuser(@Body User user);

    @POST("/product/addproduct")
    Call<String> saveproduct(@Body Product product);

    @GET("/product/getbyid")
    Call<Product> getproductbyid(@Header("id") int id);

    @POST("/savebill")
    Call<String> savebill(@Body Bill bill);
}
