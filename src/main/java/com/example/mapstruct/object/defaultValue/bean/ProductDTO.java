package com.example.mapstruct.object.defaultValue.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


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
    private String random;
    private Integer stock;
    private String createTime;

}
