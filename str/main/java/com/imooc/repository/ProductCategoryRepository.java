package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//定义第一个表单的接口

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
//将查询结果放入list中
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
