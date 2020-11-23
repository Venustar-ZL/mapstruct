package com.example.mapstruct.dataFormatMapper.mapper;

import com.example.mapstruct.dataFormatMapper.bean.Product;
import com.example.mapstruct.dataFormatMapper.bean.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 14:08
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper
public interface DataFormatMapper {

    DataFormatMapper INSTANCE = Mappers.getMapper(DataFormatMapper.class);

    /**
     * numberFormat指定基本数据类型与String之间的转换
     * dateFormat指定Date和String之间的转换
     * @param product
     * @return
     */
    @Mappings({
            @Mapping(source = "price", target = "price", numberFormat = "#.00元"),
            @Mapping(source = "stock", target = "stock", numberFormat = "#个"),
            @Mapping(target = "saleTime", dateFormat = "yyyy-MM-dd HH:mm:00"),
            @Mapping(target = "validTime", dateFormat = "yyyy-MM-dd HH:mm")
    })
    ProductDTO toDto(Product product);

    @Mappings({
            @Mapping(source = "price", target = "price", numberFormat = "#.00元"),
            @Mapping(source = "stock", target = "stock", numberFormat = "#个"),
            @Mapping(target = "saleTime", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(target = "validTime", dateFormat = "yyyy-MM-dd HH:mm")
    })
    Product toDo(ProductDTO productDTO);

}
