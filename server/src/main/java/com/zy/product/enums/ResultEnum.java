package com.zy.product.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXISTS(0, "商品不存在"),

    PRODUCT_STOCK_ERROR(1, "商品库存有误");

    private int code;

    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
