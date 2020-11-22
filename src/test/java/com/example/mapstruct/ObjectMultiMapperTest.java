package com.example.mapstruct;

import com.example.mapstruct.ObjectMapper.multi.bean.Product;
import com.example.mapstruct.ObjectMapper.multi.bean.ProductDTO;
import com.example.mapstruct.ObjectMapper.multi.bean.ProductDetail;
import com.example.mapstruct.ObjectMapper.multi.mapper.ObjectMultiMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:11
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectMultiMapperTest {

    Product product = null;
    ProductDetail productDetail1 = new ProductDetail("detail1");
    ProductDetail productDetail2 = new ProductDetail("detail2");
    ProductDetail productDetail3 = new ProductDetail("detail3");

    @BeforeEach
    void init() {
        List<ProductDetail> productDetails = new ArrayList<>();
        productDetails.add(productDetail1);
        productDetails.add(productDetail2);
        productDetails.add(productDetail3);
        product = new Product("123", productDetails);
    }

    @Test
    void testObjectMultiMapper() {
        ProductDTO productDTO = ObjectMultiMapper.INSTANCE.toDto(product);
        System.out.println(productDTO);
    }

}
