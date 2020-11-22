package com.example.mapstruct;

import com.example.mapstruct.ObjectMapper.qualifier.bean.Product;
import com.example.mapstruct.ObjectMapper.qualifier.bean.ProductDTO;
import com.example.mapstruct.ObjectMapper.qualifier.mapper.ObjectQualiferMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 16:14
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectQualiferMapperTest {

    Product product = null;

    @BeforeEach
    void init() {
        product = new Product("123", true);
    }

    @Test
    void testObjectQualiferMapper() {
        ProductDTO productDTO = ObjectQualiferMapper.INSTANCE.toDto(product);
        System.out.println(productDTO);
    }

}
