package com.example.mapstruct.object.defaultValue.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    private String random;
    private Integer stock;
    private String createTime;

}
