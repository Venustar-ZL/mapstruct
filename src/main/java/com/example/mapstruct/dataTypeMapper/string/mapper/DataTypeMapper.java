package com.example.mapstruct.dataTypeMapper.string.mapper;

import com.example.mapstruct.dataTypeMapper.string.bean.Product;
import com.example.mapstruct.dataTypeMapper.string.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 13:04
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper(componentModel = "spring")
public interface DataTypeMapper {

    DataTypeMapper INSTANCE = Mappers.getMapper(DataTypeMapper.class);

    /**
     * 对于同名同属性的字段，无需特别声明指定，自动转换。
     * 对于不同名相同属性的字段，可以使用Mapping注解指定。
     * @param product
     * @return
     */
    ProductDTO toDto(Product product);
}
