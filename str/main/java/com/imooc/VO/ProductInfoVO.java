package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

//商品详情

//重新建立productinfo对象的原因：不是所有数据都要上传给前端，比如库存啥的。。。

@Data
public class ProductInfoVO implements Serializable {
//每个VO最后都需要序列化
    private static final long serialVersionUID = -3895834204864685262L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
