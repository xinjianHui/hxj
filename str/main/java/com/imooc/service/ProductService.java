package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

//商品

public interface ProductService {

    ProductInfo findOne(String productId);

// 查询所有在架商品列表

    List<ProductInfo> findUpAll();//查询所有
    Page<ProductInfo> findAll(Pageable pageable);//分页查询所有
    ProductInfo save(ProductInfo productInfo);//save方法

    //加库存
//    这里面传入的数据CartDTO实际上是商品的id和数量
    void increaseStock(List<CartDTO> cartDTOList);//取消订单的情况

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);//下单的情况

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);
}
