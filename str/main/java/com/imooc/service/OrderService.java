package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);//创建订单
    OrderDTO findOne(String orderId);//查询单个订单
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);//查询订单列表
    OrderDTO cancel(OrderDTO orderDTO);//取消订单
    OrderDTO finish(OrderDTO orderDTO);//完结订单
    OrderDTO paid(OrderDTO orderDTO);//支付订单
    //卖家端需要查所有订单，所以还要加个方法
    Page<OrderDTO> findList(Pageable pageable);//查询订单列表
}
