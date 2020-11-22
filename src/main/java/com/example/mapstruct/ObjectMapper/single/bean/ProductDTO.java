package com.example.mapstruct.ObjectMapper.single.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ProductDTO {

    private String productId;
    private ProductDetail productDetail;

}
