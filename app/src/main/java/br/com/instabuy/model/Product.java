package br.com.instabuy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by brunolemgruber on 18/09/17.
 */

public class Product {

    @SerializedName("store_id")
    @Expose
    private String storeId;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("service")
    @Expose
    private Boolean service;
    @SerializedName("unit_type")
    @Expose
    private String unitType;
    @SerializedName("pc")
    @Expose
    private List<PriceController> pc = null;
    @SerializedName("increment_value")
    @Expose
    private Integer incrementValue;
    @SerializedName("variation_products")
    @Expose
    private List<Object> variationProducts = null;
    @SerializedName("model_frame")
    @Expose
    private String modelFrame;
    @SerializedName("installment_starting")
    @Expose
    private Integer installmentStarting;
    @SerializedName("subdomain")
    @Expose
    private String subdomain;
    @SerializedName("related_products")
    @Expose
    private List<Object> relatedProducts = null;
    @SerializedName("has_promotion")
    @Expose
    private Boolean hasPromotion;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("photos")
    @Expose
    private List<String> photos = null;
    @SerializedName("multi")
    @Expose
    private Boolean multi;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("subCategory_id")
    @Expose
    private String subCategoryId;
    @SerializedName("price_starting")
    @Expose
    private Double priceStarting;
    @SerializedName("model_name")
    @Expose
    private String modelName;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

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

    public Boolean getService() {
        return service;
    }

    public void setService(Boolean service) {
        this.service = service;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public List<PriceController> getPc() {
        return pc;
    }

    public void setPc(List<PriceController> pc) {
        this.pc = pc;
    }

    public Integer getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(Integer incrementValue) {
        this.incrementValue = incrementValue;
    }

    public List<Object> getVariationProducts() {
        return variationProducts;
    }

    public void setVariationProducts(List<Object> variationProducts) {
        this.variationProducts = variationProducts;
    }

    public String getModelFrame() {
        return modelFrame;
    }

    public void setModelFrame(String modelFrame) {
        this.modelFrame = modelFrame;
    }

    public Integer getInstallmentStarting() {
        return installmentStarting;
    }

    public void setInstallmentStarting(Integer installmentStarting) {
        this.installmentStarting = installmentStarting;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public List<Object> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<Object> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public Boolean getHasPromotion() {
        return hasPromotion;
    }

    public void setHasPromotion(Boolean hasPromotion) {
        this.hasPromotion = hasPromotion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public Boolean getMulti() {
        return multi;
    }

    public void setMulti(Boolean multi) {
        this.multi = multi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Double getPriceStarting() {
        return priceStarting;
    }

    public void setPriceStarting(Double priceStarting) {
        this.priceStarting = priceStarting;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
