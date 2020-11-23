package com.example.mapstruct;

import com.example.mapstruct.object.factory.bean.Product;
import com.example.mapstruct.object.factory.bean.ProductDTO;
import com.example.mapstruct.object.factory.mapper.ObjectFactoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Classname ObjectFactoryMapperTest
 * @Description TODO
 * @Date 2020/11/23 13:39
 * @Author by ZhangLei
 */
@SpringBootTest
public class ObjectFactoryMapperTest {

    @Test
    void testObjectFactoryMapper() {
        Product product = new Product("123", 10);
        ProductDTO productDTO = ObjectFactoryMapper.INSTANCE.toDTO(product);
        System.out.println(productDTO);
    }

}
