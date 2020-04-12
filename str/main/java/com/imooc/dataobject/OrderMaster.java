package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

//买家订单

@Entity
@Data

@DynamicUpdate
public class OrderMaster {

//id主键
    @Id
    private String orderId;//订单id
    private String buyerName;//买的人姓名
    private String buyerPhone;//手机号
    private String buyerAddress;//地址
    private String buyerOpenid;//微信id
    private BigDecimal orderAmount;//订单金额
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();//订单状态，默认0是新下单
    private Integer payStatus = PayStatusEnum.WAIT.getCode();//支付状态，默认0是未支付
    private Date createTime;//创建时间
    private Date updateTime;//更新时间

}
