package com.example.mapstruct.object.expression.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 20:33
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String productId;
    private Integer price;
    private Integer price2;

}
