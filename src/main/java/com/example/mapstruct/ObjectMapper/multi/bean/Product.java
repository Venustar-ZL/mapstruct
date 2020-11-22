package com.example.mapstruct.ObjectMapper.multi.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @Date : 2020-11-22 15:00
 * @Author: ZhangLei
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String productId;
    private List<ProductDetail> productDetail;

}
