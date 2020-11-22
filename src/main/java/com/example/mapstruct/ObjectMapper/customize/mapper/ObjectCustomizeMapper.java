package com.example.mapstruct.ObjectMapper.customize.mapper;

import com.example.mapstruct.ObjectMapper.customize.bean.Product;
import com.example.mapstruct.ObjectMapper.customize.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:57
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper( uses = {DoneFormater.class})
public interface ObjectCustomizeMapper {

    ObjectCustomizeMapper INSTANCE = Mappers.getMapper(ObjectCustomizeMapper.class);

    ProductDTO toDto(Product product);

}
