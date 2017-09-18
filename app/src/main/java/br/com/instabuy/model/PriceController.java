package br.com.instabuy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by brunolemgruber on 18/09/17.
 */

public class PriceController {

    @SerializedName("valid_price")
    @Expose
    private Double validPrice;

    public Double getValidPrice() {
        return validPrice;
    }

    public void setValidPrice(Double validPrice) {
        this.validPrice = validPrice;
    }
}
