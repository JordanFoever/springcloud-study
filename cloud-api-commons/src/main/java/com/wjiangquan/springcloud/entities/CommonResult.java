package com.wjiangquan.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author weijiangquan
 * @date 2022/9/17 -12:06
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null); //调用自己
    }

}
