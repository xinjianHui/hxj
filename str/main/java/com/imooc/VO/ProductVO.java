package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

//商品类目

@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = 7097863777546530545L;

    //定义对象名字为categoryName方便区分，但是通过JsonProperty可以让返回前端还是name
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
