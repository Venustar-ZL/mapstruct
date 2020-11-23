package com.example.mapstruct;

import com.example.mapstruct.dataFormatMapper.bean.Product;
import com.example.mapstruct.dataFormatMapper.bean.ProductDTO;
import com.example.mapstruct.dataFormatMapper.mapper.DataFormatMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 14:31
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class DataFormatMapperTest {

    Product product = null;

    @BeforeEach
    void init() {
        product = new Product("123", new BigDecimal("100"), "1个", new Date(), "2020-11-22 12:00");
    }

    @Test
    void testDateFormatMapper() {
        ProductDTO productDTO = DataFormatMapper.INSTANCE.toDto(product);
        System.out.println(productDTO);
    }

    @Test
    void test() {
        ProductDTO productDTO = new ProductDTO("123", "100.00元", 1, "2020-11-22 12:00:00", new Date());
        Product product = DataFormatMapper.INSTANCE.toDo(productDTO);
        System.out.println(product);
    }

}
