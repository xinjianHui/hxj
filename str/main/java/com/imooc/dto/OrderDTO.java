package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.EnumUtil;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data

//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//上面这个用法废弃了
//@JsonInclude(JsonInclude.Include.NON_NULL)
//不返回null字段
public class OrderDTO {

//    /** 订单id. */
//    private String orderId;
//
//    /** 买家名字. */
//    private String buyerName;
//
//    /** 买家手机号. */
//    private String buyerPhone;
//
//    /** 买家地址. */
//    private String buyerAddress;
//
//    /** 买家微信Openid. */
//    private String buyerOpenid;
//
//    /** 订单总金额. */
//    private BigDecimal orderAmount;
//
//    /** 订单状态, 默认为0新下单. */
//    private Integer orderStatus;
//
//    /** 支付状态, 默认为0未支付. */
//    private Integer payStatus;
//


    private String orderId;//订单id
    private String buyerName;//买的人姓名
    private String buyerPhone;//手机号
    private String buyerAddress;//地址
    private String buyerOpenid;//微信id
    private BigDecimal orderAmount;//订单金额
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();//订单状态，默认0是新下单
    private Integer payStatus = PayStatusEnum.WAIT.getCode();//支付状态，默认0是未支付

// 创建时间
    @JsonSerialize(using = Date2LongSerializer.class)//很牛逼，这个方法
    private Date createTime;
    //加上 @JsonSerialize 注解，使用Date2LongSerializer.class类就可以了

//  更新时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    //这个一定要加，@JsonIgnore可以把OrderDTO对返回Json格式，这个方法就会被忽略
    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
//让orderStatus这个int型的值，直接返回OrderStatusEnum这个枚举
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);//（code，枚举类）
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {

        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
