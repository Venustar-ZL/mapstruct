package com.example.mapstruct.object.factory.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Product
 * @Description TODO
 * @Date 2020/11/23 13:35
 * @Author by ZhangLei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String productId;

    private Integer stock;

}
