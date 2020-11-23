package com.example.mapstruct.object.factory.bean;

/**
 * @Classname DTOFactory
 * @Description TODO
 * @Date 2020/11/23 13:35
 * @Author by ZhangLei
 */
public class DTOFactory {

    public ProductDTO createDTO() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setStock(0);
        productDTO.setDetail("productDTO");
        return productDTO;
    }

}
