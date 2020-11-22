package com.example.mapstruct.ObjectMapper.multi.mapper;

import com.example.mapstruct.ObjectMapper.multi.bean.Product;
import com.example.mapstruct.ObjectMapper.multi.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:10
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper
public interface ObjectMultiMapper {

    ObjectMultiMapper INSTANCE = Mappers.getMapper(ObjectMultiMapper.class);

    /**
     * 相同类型的对象引用，直接简单的对引用进行拷贝
     * @param product
     * @return
     */
    ProductDTO toDto(Product product);

}
