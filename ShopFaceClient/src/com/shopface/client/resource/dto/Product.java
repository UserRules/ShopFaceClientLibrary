/**
 * 
 */
package com.shopface.client.resource.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author vedsurtani
 */
public class Product {

    private String              id;
    private String              title;
    private String              checkoutUrl;
    private double              actualPrice;
    private double              sellingPrice;
    private String              currencyCode;
    private Date                startTime;
    private Date                endTime;
    private String              categoryId;
    private String              shortDescription;
    private String              description;
    private String              thumbnailUrl;
    private List<String>        images;
    private String              landingPageUrl;
    private boolean             isPublished;
    private boolean             isFeatured;
    private Map<String, String> details;
    private Map<String, String> attributes;
    private List<String>        tags;
    private Date                lastModifiedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the checkoutUrl
     */
    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    /**
     * @param checkoutUrl the checkoutUrl to set
     */
    public void setCheckoutUrl(String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
    }

    /**
     * @return the actualPrice
     */
    public double getActualPrice() {
        return actualPrice;
    }

    /**
     * @param actualPrice the actualPrice to set
     */
    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * @return the sellingPrice
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * @param shortDescription the shortDescription to set
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * @return the thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * @param thumbnailUrl the thumbnailUrl to set
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * @return the images
     */
    public List<String> getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(List<String> images) {
        this.images = images;
    }

    /**
     * @return the isPublished
     */
    public boolean isPublished() {
        return isPublished;
    }

    /**
     * @param isPublished the isPublished to set
     */
    public void setPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    /**
     * @return the isFeatured
     */
    public boolean isFeatured() {
        return isFeatured;
    }

    /**
     * @param isFeatured the isFeatured to set
     */
    public void setFeatured(boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     * @return the details
     */
    public Map<String, String> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(Map<String, String> details) {
        this.details = details;
    }

    /**
     * @return the attributes
     */
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getLandingPageUrl() {
        return landingPageUrl;
    }

    public void setLandingPageUrl(String landingPageUrl) {
        this.landingPageUrl = landingPageUrl;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
