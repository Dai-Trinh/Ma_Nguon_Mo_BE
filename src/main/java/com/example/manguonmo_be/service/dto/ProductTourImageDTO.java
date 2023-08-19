package com.example.manguonmo_be.service.dto;

import javax.persistence.Column;

public class ProductTourImageDTO {

    private String productTourImageTiltle;

    private String productTourImagePath;

    public String getProductTourImageTiltle() {
        return productTourImageTiltle;
    }

    public void setProductTourImageTiltle(String productTourImageTiltle) {
        this.productTourImageTiltle = productTourImageTiltle;
    }

    public String getProductTourImagePath() {
        return productTourImagePath;
    }

    public void setProductTourImagePath(String productTourImagePath) {
        this.productTourImagePath = productTourImagePath;
    }
}
