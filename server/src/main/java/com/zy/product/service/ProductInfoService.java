package com.zy.product.service;

import com.zy.product.common.DecreaseStockInput;
import com.zy.product.common.ProductInfoOutput;
import com.zy.product.pojo.ProductInfo;

import java.util.List;

public interface ProductInfoService {

    List<ProductInfo> findUPAll();

    List<ProductInfoOutput> findList(List<String> productIdList);

    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
