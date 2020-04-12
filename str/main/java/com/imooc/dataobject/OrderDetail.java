package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

//订单详情

@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;
    private String orderId;//订单id
    private String productId;//商品id
    private String productName;//商品名字
    private BigDecimal productPrice;//单价
    private Integer productQuantity;//数量
    private String productIcon;//商品图片
}
