package com.shopface.client.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.annotations.cache.NoCache;

import com.shopface.client.resource.dto.Product;
import com.shopface.client.resource.dto.ProductCategory;

@Path("/{companyShortName}")
@NoCache
public interface ProductResource {

    @POST
    @Path("/product/new")
    @Produces("application/json; charset=utf-8")
    @Consumes("application/json; charset=utf-8")
    public Product createProduct(@PathParam("companyShortName") String companyShortName, Product product);

    @GET
    @Path("/product")
    @Consumes("application/json; charset=utf-8")
    public String listProducts(@PathParam("companyShortName") String companyShortName, @QueryParam("start") int start, @QueryParam("rows") int rows);

    @POST
    @Path("/category/new")
    @Produces("application/json; charset=utf-8")
    @Consumes("application/json; charset=utf-8")
    public ProductCategory createProductCategory(@PathParam("companyShortName") String companyShortName, ProductCategory productCategory);

    @GET
    @Path("/category")
    @Produces("application/json; charset=utf-8")
    @Consumes("application/json; charset=utf-8")
    public List<ProductCategory> listProductCategories(@PathParam("companyShortName") String companyShortName);
}
