package com.techforge.easybill.Service;

import com.techforge.easybill.ApiInterface.ApiService;
import com.techforge.easybill.Entity.Bill;
import com.techforge.easybill.Entity.Product;
import com.techforge.easybill.Entity.User;
import com.techforge.easybill.RetrofitClient;
import javafx.application.Platform;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class SetupService {

    public void createuser() {

        User user = new User("inba", "1234", "inbanithi107@gmail.com");

        ApiService apiService = RetrofitClient.getApiService();
        Call<String> call = apiService.saveuser(user);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful() && response.body() != null) {
                    String line = response.body();
                    // Update UI with the fetched item
                    System.out.println(line);
                    Platform.runLater(() -> {
                        

                    });
                } else {
                    // Handle the error
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {

            }
        });

    }

    public void addproduct(Product product) {
        ApiService apiService = RetrofitClient.getApiService();
        Call<String> call = apiService.saveproduct(product);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    String message = response.body();
                    System.out.println(message);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {

            }
        });
    }

    public void getproduct(int id, ProductCallback productCallback) {
        ApiService apiService = RetrofitClient.getApiService();
        Call<Product> call = apiService.getproductbyid(id);

        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
               productCallback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable throwable) {
                System.out.println("failed");
            }
        });


    }

    public void savebill(Bill bill){
        ApiService apiService = RetrofitClient.getApiService();
        Call<String> call = apiService.savebill(bill);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {

            }
        });
    }


    public interface ProductCallback {
        void onSuccess(Product product);

        void onFailure(Throwable throwable);
    }
}
