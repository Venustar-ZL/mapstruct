package com.example.mapstruct.dataTypeMapper.map;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.Map;

/**
 * @ClassName:
 * @Description: Map类型的映射
 * @Date : 2020-11-22 16:29
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper
public interface MapMapper {

    MapMapper INSTANCE = Mappers.getMapper(MapMapper.class);

    @MapMapping(valueDateFormat = "yyyy-MM-dd HH:mm:ss")
    Map<String, String> toDTO(Map<Long, Date> map);

}
