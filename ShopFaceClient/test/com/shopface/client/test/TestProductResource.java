/*
 * Any use of the Material is governed by the terms of the actual license agreement between Web Scale and the user.
 * Copyright 2009 Web Scale, India All rights reserved. Any rights not expressly granted herein are reserved.
 */
package com.shopface.client.test;

import com.shopface.client.ShopFaceClient;
import com.shopface.client.resource.dto.Product;

public class TestProductResource {

    public static void main(String[] args) {
        ShopFaceClient shopFaceClient = new ShopFaceClient("dev.shopfaceapp.com", "snapdeal", "admin@webscale.com", "test123");
        Product product = new Product();

        product.setTitle("test api");

        shopFaceClient.createProduct(product);
        
        System.out.println(shopFaceClient.getProducts());
    }

}
