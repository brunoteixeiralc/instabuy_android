package br.com.instabuy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import br.com.instabuy.adapter.ProductAdapter;
import br.com.instabuy.model.ProductsResponse;
import br.com.instabuy.retrofit.ApiClient;
import br.com.instabuy.retrofit.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    protected RecyclerView recyclerView;
    private LinearLayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadProducts("57eec92f072d415b67c24175");

        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);

    }

    private void loadProducts(String subcategory_id){
        ApiInterface apiClient = ApiClient.getClient().create(ApiInterface.class);

        Call<ProductsResponse> call = apiClient.getProducts(subcategory_id);
        call.enqueue(new Callback<ProductsResponse>() {
            @Override
            public void onResponse(Call<ProductsResponse> call, Response<ProductsResponse> response) {
                ProductsResponse products = response.body();
                Log.e(TAG, products.toString());

                mAdapter = new ProductAdapter(MainActivity.this,products.getData());
                recyclerView.setAdapter(mAdapter);

            }

            @Override
            public void onFailure(Call<ProductsResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
