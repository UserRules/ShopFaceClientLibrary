/*
 * Any use of the Material is governed by the terms of the actual license agreement between Web Scale and the user.
 * Copyright 2009 Web Scale, India All rights reserved. Any rights not expressly granted herein are reserved.
 */
package com.shopface.client;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.client.core.executors.ApacheHttpClient4Executor;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import com.shopface.client.resource.ProductResource;
import com.shopface.client.resource.dto.Product;
import com.shopface.client.resource.dto.ProductCategory;

public class ShopFaceClient {

    private ProductResource productResource;
    private String          companyShortName;

    static {
        RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
    }

    public ShopFaceClient(String host, String companyShortName, String username, String password) {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        httpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));
        HttpRequestInterceptor preemptiveAuth = new HttpRequestInterceptor() {
            public void process(final HttpRequest request, final HttpContext context) throws HttpException, IOException {
                AuthState authState = (AuthState) context.getAttribute(ClientContext.TARGET_AUTH_STATE);
                CredentialsProvider credsProvider = (CredentialsProvider) context.getAttribute(ClientContext.CREDS_PROVIDER);
                HttpHost targetHost = (HttpHost) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);

                if (authState.getAuthScheme() == null) {
                    AuthScope authScope = new AuthScope(targetHost.getHostName(), targetHost.getPort());
                    Credentials creds = credsProvider.getCredentials(authScope);
                    if (creds != null) {
                        authState.setAuthScheme(new BasicScheme());
                        authState.setCredentials(creds);
                    }
                }
            }
        };
        httpClient.addRequestInterceptor(preemptiveAuth, 0);

        ApacheHttpClient4Executor clientExecutor = new ApacheHttpClient4Executor(httpClient);

        this.productResource = ProxyFactory.create(ProductResource.class, "http://" + host + "/rest", clientExecutor);
        this.companyShortName = companyShortName;
    }

    public Product createProduct(Product product) {
        return this.productResource.createProduct(companyShortName, product);
    }

    public ProductCategory createCategory(ProductCategory productCategory) {
        return this.productResource.createProductCategory(companyShortName, productCategory);
    }

    public List<ProductCategory> listCategories() {
        return this.productResource.listProductCategories(companyShortName);
    }

    public String getProducts() {
        return this.productResource.listProducts(companyShortName, 0, 5);
    }

}
