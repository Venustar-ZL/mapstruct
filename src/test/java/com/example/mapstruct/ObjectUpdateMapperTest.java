package com.example.mapstruct;

import com.example.mapstruct.object.update.bean.Product;
import com.example.mapstruct.object.update.bean.ProductDTO;
import com.example.mapstruct.object.update.mapper.ObjectUpdateMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:01
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectUpdateMapperTest {

    Product product = new Product("123", "100", 10);
    ProductDTO productDTO = new ProductDTO("233", "200", 20);

    @Test
    void testObjectMapper() {
        ObjectUpdateMapper.INSTANCE.updateDTO(product, productDTO);
        System.out.println(productDTO);
    }

}
