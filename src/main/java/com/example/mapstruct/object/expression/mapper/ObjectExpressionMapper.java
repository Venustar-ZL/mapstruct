package com.example.mapstruct.object.expression.mapper;

import com.example.mapstruct.object.expression.bean.Product;
import com.example.mapstruct.object.expression.bean.ProductDTO;
import com.example.mapstruct.utils.MathUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:07
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper(imports = MathUtils.class)
public interface ObjectExpressionMapper {

    ObjectExpressionMapper INSTANCE = Mappers.getMapper(ObjectExpressionMapper.class);

    @Mappings({
            @Mapping(target = "price", expression = "java(product.getPrice1() + product.getPrice2())"),//直接相加
            @Mapping(target = "price2", expression = "java(MathUtils.addAndReturn0(product.getPrice1(), product.getPrice2()))") //使用工具类处理
    })
    ProductDTO toDTO(Product product);

}
