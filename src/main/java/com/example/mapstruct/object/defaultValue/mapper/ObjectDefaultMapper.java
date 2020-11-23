package com.example.mapstruct.object.defaultValue.mapper;

import com.example.mapstruct.object.defaultValue.bean.Product;
import com.example.mapstruct.object.defaultValue.bean.ProductDTO;
import com.example.mapstruct.utils.UuidUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:27
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper(imports = UuidUtils.class)
public interface ObjectDefaultMapper {

    ObjectDefaultMapper INSTANCE = Mappers.getMapper(ObjectDefaultMapper.class);

    @Mappings({
            @Mapping(target = "productId", source = "productId", defaultValue = "123"), //当product的productId为null，设置为0
            @Mapping(target = "random", source = "random", defaultExpression = "java(UuidUtils.getUuid())"), //缺省设置随机数
            @Mapping(target = "stock", constant = "100"), //固定设置为0, 常量
            @Mapping(target = "createTime", dateFormat = "yyyy-MM-dd", constant = "2020-01-01") //固定格式化设置为2020-01-01，
    })
    ProductDTO toDTO(Product product);

}
