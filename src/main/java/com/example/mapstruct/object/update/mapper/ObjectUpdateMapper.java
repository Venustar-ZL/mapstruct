package com.example.mapstruct.object.update.mapper;

import com.example.mapstruct.object.update.bean.Product;
import com.example.mapstruct.object.update.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 20:59
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper
public interface ObjectUpdateMapper {

    ObjectUpdateMapper INSTANCE = Mappers.getMapper(ObjectUpdateMapper.class);

    void updateDTO(Product product, @MappingTarget ProductDTO productDTO);

}
