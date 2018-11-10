package com.zy.product.utils;

import com.zy.product.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object){
        return new ResultVO(0, "成功", object);
    }
}
