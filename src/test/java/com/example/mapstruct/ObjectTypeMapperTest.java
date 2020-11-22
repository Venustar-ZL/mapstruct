package com.example.mapstruct;

import com.example.mapstruct.ObjectMapper.type.bean.Product;
import com.example.mapstruct.ObjectMapper.type.bean.ProductDTO;
import com.example.mapstruct.ObjectMapper.type.bean.ProductDetail;
import com.example.mapstruct.ObjectMapper.type.mapper.ObjectTypeMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:28
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectTypeMapperTest {

    Product product = null;
    ProductDetail productDetail = null;

    @BeforeEach
    void init() {
        productDetail = new ProductDetail("product-detail");
        product = new Product("123", productDetail);
    }

    @Test
    void testObjectTypeMapper() {
        ProductDTO productDTO = ObjectTypeMapper.INSTANCE.toDto(product);
//        ProductDTO productDTO = objectTypeMapper.toDto(product);
        System.out.println(product);
        System.out.println(productDTO);
    }

}
