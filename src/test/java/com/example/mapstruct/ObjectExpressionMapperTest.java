package com.example.mapstruct;

import com.example.mapstruct.object.expression.bean.Product;
import com.example.mapstruct.object.expression.bean.ProductDTO;
import com.example.mapstruct.object.expression.mapper.ObjectExpressionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:14
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class ObjectExpressionMapperTest {

    Product product = new Product("123", 10, 20);

    @Test
    void testObjectExpressionMapper() {
        ProductDTO productDTO = ObjectExpressionMapper.INSTANCE.toDTO(product);
        System.out.println(productDTO);
    }

}
