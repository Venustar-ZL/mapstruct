package com.example.mapstruct;

import com.example.mapstruct.ObjectMapper.customize.bean.Product;
import com.example.mapstruct.ObjectMapper.customize.bean.ProductDTO;
import com.example.mapstruct.ObjectMapper.customize.mapper.ObjectCustomizeMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 16:01
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectCustomizeMapperTest {

    Product product = null;

    @BeforeEach
    void init() {
        product = new Product("123", true);
    }

    @Test
    void testObjectCustomizeMapper() {
        ProductDTO productDTO = ObjectCustomizeMapper.INSTANCE.toDto(product);
        System.out.println(productDTO);
    }

}
