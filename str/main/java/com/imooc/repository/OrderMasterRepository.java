package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
//findByBuyerOpenid按照買家的openid查找某個訂單，Pageable pageable指某個，不加就是查詢所有
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
