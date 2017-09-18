package br.com.instabuy.retrofit;

import br.com.instabuy.model.ProductsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by brunolemgruber on 18/09/17.
 */

public interface ApiInterface {

    @GET("product.json")
    Call<ProductsResponse> getProducts(@Query("subcategory_id") String subcategory_id);
}
