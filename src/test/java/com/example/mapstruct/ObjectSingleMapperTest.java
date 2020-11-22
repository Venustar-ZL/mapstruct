package com.example.mapstruct;

import com.example.mapstruct.ObjectMapper.single.bean.Product;
import com.example.mapstruct.ObjectMapper.single.bean.ProductDTO;
import com.example.mapstruct.ObjectMapper.single.bean.ProductDetail;
import com.example.mapstruct.ObjectMapper.single.mapper.ObjectSingleMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:05
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectSingleMapperTest {

    Product product = null;

    @BeforeEach
    void init() {
        product = new Product("123", new ProductDetail("product to DTO"));
    }

    @Test
    void testObjectSingleMapper() {
        ProductDTO productDTO = ObjectSingleMapper.INSTANCE.toDto(product);
        System.out.println(productDTO);
    }

}
