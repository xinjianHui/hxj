package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;


//将数据库映射成对象
@Entity
//注解：更新时间
@DynamicUpdate
//依赖中引进工具“lombok”，用DATA注解可以自动生成getset方法
@Data
//@Table(name = "product_category")
public class ProductCategory {

    /** 类目id. */
//    主键
    @Id
//    自增
//    @GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

//构造方法
    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }


}
