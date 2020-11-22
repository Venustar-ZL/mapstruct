package com.example.mapstruct.ObjectMapper.qualifier.mapper;

import com.example.mapstruct.ObjectMapper.qualifier.bean.Product;
import com.example.mapstruct.ObjectMapper.qualifier.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:57
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper( uses = {DoneFormater.class})
public interface ObjectQualiferMapper {

    ObjectQualiferMapper INSTANCE = Mappers.getMapper(ObjectQualiferMapper.class);

    @Mapping(source = "isDone", target = "isDone", qualifiedByName = "DoneDetailFormater")
    ProductDTO toDto(Product product);

}
