package com.example.mapstruct.object.resultInherit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 21:43
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Data
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String id) {
        super(id);
    }
}
