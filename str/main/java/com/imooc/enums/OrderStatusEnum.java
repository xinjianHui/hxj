package com.imooc.enums;

import lombok.Getter;

//买家订单的枚举
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;//固定格式

    private String message;//固定格式

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
