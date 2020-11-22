package com.example.mapstruct;

import com.example.mapstruct.object.defaultValue.bean.Product;
import com.example.mapstruct.object.defaultValue.bean.ProductDTO;
import com.example.mapstruct.object.defaultValue.mapper.ObjectDefaultMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:35
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectDefaultMapperTest {

    Product product = new Product();

    @Test
    void testObjectDefaultValueMapper() {
        ProductDTO productDTO = ObjectDefaultMapper.INSTANCE.toDTO(product);
        System.out.println(productDTO);
    }

}
