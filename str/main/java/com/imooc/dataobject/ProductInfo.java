package com.imooc.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


//商品


@Entity
@Data
//自动更新注解，让字段自动更新
@DynamicUpdate
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 6399186181668983148L;

    @Id
    private String productId;
    private String productName;//名字
    private BigDecimal productPrice;//价格
    private Integer productStock;//库存
    private String productDescription;//说明
    private String productIcon;//图片
    private Integer productStatus = ProductStatusEnum.UP.getCode();//状态，0为在架，1为下架
    private Integer categoryType;//类型编号
    private Date createTime;//创建时间
    private Date updateTime;//修改时间需要自动更新

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }

//图片链接加host拼接成完整 url
//  host

    public ProductInfo addImageHost(String host) {
        if (productIcon.startsWith("//") || productIcon.startsWith("http")) {
            return this;
        }

        if (!host.startsWith("http")) {
            host = "//" + host;
        }
        if (!host.endsWith("/")) {
            host = host + "/";
        }
        productIcon = host + productIcon;
        return this;
    }
}
