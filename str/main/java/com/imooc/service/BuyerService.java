package com.imooc.service;

import com.imooc.dto.OrderDTO;

//买家

public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);//参数设置为openid，orderId

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
