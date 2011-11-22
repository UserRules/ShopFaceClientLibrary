package com.shopface.client.resource.dto;

public class ProductCategory {

    private String id;
    private String name;
    private int    sequence;
    private int    noOfFeaturedProducts = 3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getNoOfFeaturedProducts() {
        return noOfFeaturedProducts;
    }

    public void setNoOfFeaturedProducts(int noOfFeaturedProducts) {
        this.noOfFeaturedProducts = noOfFeaturedProducts;
    }

}
