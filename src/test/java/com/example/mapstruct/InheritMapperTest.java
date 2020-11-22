package com.example.mapstruct;

import com.example.mapstruct.object.relationInherit.bean.Product;
import com.example.mapstruct.object.relationInherit.bean.ProductDTO;
import com.example.mapstruct.object.relationInherit.mapper.RelationInheritMapper;
import com.example.mapstruct.object.resultInherit.bean.Animal;
import com.example.mapstruct.object.resultInherit.bean.Dog;
import com.example.mapstruct.object.resultInherit.mapper.ResultInheritMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:45
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@SpringBootTest
public class InheritMapperTest {

    @Test
    void testResultInheritMapper() {
        Dog dog = new Dog("dog");
        Animal cat = ResultInheritMapper.INSTANCE.to(dog);
        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }

    @Test
    void testRelationInheritMapper() {
        Product product = new Product("id1", "id2", "detail1", "detail2");
        ProductDTO productDTO = new ProductDTO("id", "detail");
        RelationInheritMapper.INSTANCE.update(productDTO, product);
        System.out.println(productDTO);

        System.out.println("--------reverse---------");

        Product temp = RelationInheritMapper.INSTANCE.toEntity(productDTO);
        System.out.println(temp);
    }

}
