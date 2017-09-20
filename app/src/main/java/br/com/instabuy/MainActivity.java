package br.com.instabuy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import br.com.instabuy.model.ProductsResponse;
import br.com.instabuy.retrofit.ApiClient;
import br.com.instabuy.retrofit.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String AMAZON_URL = "https://s3-us-west-2.amazonaws.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loadProducts("57eec92f072d415b67c24175");
    }

    private void loadProducts(String subcategory_id){
        ApiInterface apiClient = ApiClient.getClient().create(ApiInterface.class);

        Call<ProductsResponse> call = apiClient.getProducts(subcategory_id);
        call.enqueue(new Callback<ProductsResponse>() {
            @Override
            public void onResponse(Call<ProductsResponse> call, Response<ProductsResponse> response) {
                ProductsResponse products = response.body();
                Log.e(TAG, products.toString());

            }

            @Override
            public void onFailure(Call<ProductsResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
