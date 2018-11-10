package com.zy.product.common;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoOutput {

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private Integer productStatus;

    private String productDescription;

    private String productIcon;

    private Integer categoryType;

}
