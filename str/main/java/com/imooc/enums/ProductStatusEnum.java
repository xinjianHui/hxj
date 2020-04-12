package com.imooc.enums;

import lombok.Getter;

//枚举
//商品状态

//调用get方法
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;//固定格式

    private String message;//固定格式

    ProductStatusEnum(Integer code, String message) {//构造方法
        this.code = code;
        this.message = message;
    }


}
