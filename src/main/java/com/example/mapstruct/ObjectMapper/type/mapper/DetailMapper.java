package com.example.mapstruct.ObjectMapper.type.mapper;

import com.example.mapstruct.ObjectMapper.type.bean.ProductDTODetail;
import com.example.mapstruct.ObjectMapper.type.bean.ProductDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:26
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper(componentModel = "spring")
public interface DetailMapper {

//    DetailMapper INSTANCE = Mappers.getMapper(DetailMapper.class);

    @Mapping(source = "productDetail", target = "productDtoDetail")
    ProductDTODetail toDetail(ProductDetail productDetail);

}
