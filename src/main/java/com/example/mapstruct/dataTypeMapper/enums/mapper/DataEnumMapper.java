package com.example.mapstruct.dataTypeMapper.enums.mapper;

import com.example.mapstruct.dataTypeMapper.enums.bean.E1;
import com.example.mapstruct.dataTypeMapper.enums.bean.E2;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;
import org.mapstruct.ValueMappings;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 20:14
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper
public interface DataEnumMapper {

    DataEnumMapper INSTANCE = Mappers.getMapper(DataEnumMapper.class);

    @ValueMappings({
            @ValueMapping(target = "E1_1", source = "E2_1"),
            @ValueMapping(target = "E1_2", source = "E2_2"),
            @ValueMapping(target = MappingConstants.NULL, source = "E2_3") //转换成null
    })
    E1 toDTO(E2 e2);

}
