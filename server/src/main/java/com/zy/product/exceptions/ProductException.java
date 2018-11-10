package com.zy.product.exceptions;

import com.zy.product.enums.ResultEnum;

public class ProductException extends RuntimeException {

    private int code;

    public ProductException(int code, String message){
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
