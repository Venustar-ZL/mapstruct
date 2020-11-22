package com.example.mapstruct.dataFormatMapper.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 14:08
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private String productId;
    private BigDecimal price;
    private String stock;
    private Date saleTime;
    private String validTime;

}
