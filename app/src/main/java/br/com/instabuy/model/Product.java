package br.com.instabuy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by brunolemgruber on 18/09/17.
 */

public class Product {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("pc")
    @Expose
    private List<PriceController> pc = null;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("name")
    @Expose
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public List<PriceController> getPc() {
        return pc;
    }

    public void setPc(List<PriceController> pc) {
        this.pc = pc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
