package com.imooc.VO;

import lombok.Data;

import java.io.Serializable;

//http请求返回的最外层对象

@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 3068837394742385883L;

    /** code为错误码，他=0说明没毛病. */
    private Integer code;

    /** msg是提示信息. */
    private String msg;

    /** data是返回的具体内容. */
    private T data;
}
