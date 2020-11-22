package com.example.mapstruct;

import com.example.mapstruct.dataTypeMapper.enums.bean.E1;
import com.example.mapstruct.dataTypeMapper.enums.bean.E2;
import com.example.mapstruct.dataTypeMapper.enums.mapper.DataEnumMapper;
import com.example.mapstruct.dataTypeMapper.map.MapMapper;
import com.example.mapstruct.dataTypeMapper.string.bean.Product;
import com.example.mapstruct.dataTypeMapper.string.bean.ProductDTO;
import com.example.mapstruct.dataTypeMapper.string.mapper.DataTypeMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 13:51
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class DataTypeMapperTest {

    Product product = null;
    E2 e2;

    @BeforeEach
    void init() {
        product = new Product("123", 1L);
    }

    @Test
    void testDataTypeMapper() {
        ProductDTO productDTO = DataTypeMapper.INSTANCE.toDto(product);
        System.out.println(productDTO);
    }

    @Test
    void testMapMapper() {
        Map<Long, Date> temp = new HashMap<>();
        temp.put(1L, new Date());
        Map<String, String> map = MapMapper.INSTANCE.toDTO(temp);
        System.out.println(map.toString());
    }

    @Test
    void testEnumMapper() {
        E1 e1 = DataEnumMapper.INSTANCE.toDTO(E2.E2_1);
        System.out.println(e1.toString());
    }

}
