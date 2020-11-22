package com.example.mapstruct.simpleMapper.mapper;

import com.example.mapstruct.simpleMapper.bean.Product;
import com.example.mapstruct.simpleMapper.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 13:04
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper(componentModel = "spring")
public interface SimpleMapper {

    SimpleMapper INSTANCE = Mappers.getMapper(SimpleMapper.class);

    /**
     * 对于同名同属性的字段，无需特别声明指定，自动转换。
     * 对于不同名相同属性的字段，可以使用Mapping注解指定。
     * @param product
     * @return
     */
    @Mappings({
            @Mapping(source = "name", target = "productName")
    })
    ProductDTO toDto(Product product);
}
