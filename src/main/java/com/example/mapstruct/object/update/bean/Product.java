package com.example.mapstruct.object.update.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 20:35
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String productId;
    private String price;
    private Integer stock;

}
