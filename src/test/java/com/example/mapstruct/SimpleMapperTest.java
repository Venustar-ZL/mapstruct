package com.example.mapstruct;

import com.example.mapstruct.simpleMapper.bean.Product;
import com.example.mapstruct.simpleMapper.bean.ProductDTO;
import com.example.mapstruct.simpleMapper.mapper.SimpleMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 13:08
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class SimpleMapperTest {

    Product product = null;

    @BeforeEach
    void init() {
        product = new Product("123", "product");
    }

    @Test
    void testSimpleMapper() {
        ProductDTO productDTO = SimpleMapper.INSTANCE.toDto(product);
        System.out.println(productDTO);
    }

}
