package br.com.instabuy.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by brunolemgruber on 18/09/17.
 */

public class ApiClient {

        private static Retrofit retrofit = null;
        public static final String BASE_URL = "https://instabuy.com.br/apiv2_2/";

        public static Retrofit getClient() {
            if (retrofit==null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }

