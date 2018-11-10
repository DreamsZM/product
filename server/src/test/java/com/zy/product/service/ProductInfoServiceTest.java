package com.zy.product.service;

import com.zy.product.ProductApplicationTests;
import com.zy.product.dto.CartDTO;
import com.zy.product.exceptions.ProductException;
import com.zy.product.pojo.ProductInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductInfoServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findUPAll() {
        List<ProductInfo> productInfoList = productInfoService.findUPAll();
        for (ProductInfo productInfo : productInfoList){
            System.out.println(productInfo.getProductName());
        }
    }

    @Test
    public void decreaseStock(){


    }
}