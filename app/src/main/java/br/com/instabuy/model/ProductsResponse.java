package br.com.instabuy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by brunolemgruber on 18/09/17.
 */

public class ProductsResponse implements Serializable {

    @SerializedName("data")
    @Expose
    private List<Product> data = null;

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }

}
