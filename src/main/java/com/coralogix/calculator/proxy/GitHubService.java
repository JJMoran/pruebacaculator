package com.coralogix.calculator.proxy;

import com.coralogix.calculator.model.response.Product;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import javax.websocket.server.PathParam;

public interface GitHubService {



    @GET("latest")
    Call<Product> listRepos(@Query("base") String base, @Query("symbols") String user);

}
