package com.example.mapstruct.object.relationInherit.mapper;

import com.example.mapstruct.object.relationInherit.bean.Product;
import com.example.mapstruct.object.relationInherit.bean.ProductDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 22:07
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper
public interface RelationInheritMapper {

    RelationInheritMapper INSTANCE = Mappers.getMapper(RelationInheritMapper.class);

    @Mapping(target = "productId", source = "id1")
    @Mapping(target = "detail", source = "detail1")
    ProductDTO toDTO(Product product);

    @Mapping(target = "productId", source = "id2")
    @Mapping(target = "detail", source = "detail2")
    ProductDTO toDTO2(Product product);

    @InheritConfiguration(name = "toDTO") //对toDTO的映射关系进行继承
    @Mapping(target = "detail", source = "detail2") //对继承的关系进行重写
    void update(@MappingTarget ProductDTO productDTO, Product product);

    @InheritInverseConfiguration(name = "toDTO") //对toDTO的映射关系进行逆继承
    @Mapping(target = "detail2", source = "detail") //对逆向继承的关系进行重写
    Product toEntity(ProductDTO dto);

}
