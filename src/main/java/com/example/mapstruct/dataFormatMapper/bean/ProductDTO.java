package com.example.mapstruct.dataFormatMapper.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ProductDTO {

    private String productId;
    private String price;
    private Integer stock;
    private String saleTime;
    private Date validTime;

}
