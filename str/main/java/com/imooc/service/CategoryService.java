package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;


public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();//查询所有
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);//查买家端
    ProductCategory save(ProductCategory productCategory);//新增和更新
}
