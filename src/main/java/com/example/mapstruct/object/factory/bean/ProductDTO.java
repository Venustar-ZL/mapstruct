package com.example.mapstruct.object.factory.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ProductDTO
 * @Description TODO
 * @Date 2020/11/23 13:36
 * @Author by ZhangLei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private String productId;

    private String detail;

    private Integer stock;

}
