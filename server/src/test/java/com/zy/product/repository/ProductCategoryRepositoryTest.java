package com.zy.product.repository;

import com.zy.product.pojo.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByCategoryTypeIn() {

        List<ProductCategory> productCategoryList = repository.findByCategoryTypeIn(Arrays.asList(1,2,3));
        for (ProductCategory productCategory : productCategoryList){
            System.out.println(productCategory.getCategoryName());
        }
    }
}