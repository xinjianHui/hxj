package com.imooc.utils;

import com.imooc.enums.CodeEnum;

//相当于CodeEnum接口实现
public class EnumUtil {
//T泛型
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {//遍历枚举类中的每个code枚举
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
