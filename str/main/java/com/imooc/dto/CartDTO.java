package com.imooc.dto;

import lombok.Data;

//购物车

@Data
public class CartDTO {

    private String productId;//商品di
    private Integer productQuantity;//数量

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
