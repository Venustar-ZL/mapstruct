package com.example.mapstruct.object.resultInherit.mapper;

import com.example.mapstruct.object.resultInherit.bean.Animal;
import com.example.mapstruct.object.resultInherit.bean.Cat;
import com.example.mapstruct.object.resultInherit.bean.Dog;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:44
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Mapper(imports = Cat.class)
public interface ResultInheritMapper {

    ResultInheritMapper INSTANCE = Mappers.getMapper(ResultInheritMapper.class);

    @BeanMapping(resultType = Cat.class)//指定返回的结果类型
    Animal to(Dog dog);

}
