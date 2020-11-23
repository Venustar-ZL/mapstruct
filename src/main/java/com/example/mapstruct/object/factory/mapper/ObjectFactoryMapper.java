package com.example.mapstruct.object.factory.mapper;

import com.example.mapstruct.object.factory.bean.DTOFactory;
import com.example.mapstruct.object.factory.bean.Product;
import com.example.mapstruct.object.factory.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Classname ObjectFactoryMapper
 * @Description TODO
 * @Date 2020/11/23 13:37
 * @Author by ZhangLei
 */
@Mapper(uses = DTOFactory.class)
public interface ObjectFactoryMapper {

    ObjectFactoryMapper INSTANCE = Mappers.getMapper(ObjectFactoryMapper.class);

    ProductDTO toDTO(Product product);

}
