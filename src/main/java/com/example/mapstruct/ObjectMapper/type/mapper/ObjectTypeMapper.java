package com.example.mapstruct.ObjectMapper.type.mapper;

import com.example.mapstruct.ObjectMapper.type.bean.Product;
import com.example.mapstruct.ObjectMapper.type.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:23
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper
public interface ObjectTypeMapper {

    ObjectTypeMapper INSTANCE = Mappers.getMapper(ObjectTypeMapper.class);

    @Mappings({
            @Mapping(source = "productId", target = "productDtoId"),
            // 嵌套类型转换
            @Mapping(source = "productDetail.productDetail", target = "productDTODetail.productDtoDetail"),
            @Mapping(source = "productDetail.productDetailId", target = "productDTODetail.productDTODetailId")
//            @Mapping(source = "productDetail", target = "productDTODetail")
    })
    ProductDTO toDto(Product product);

}
