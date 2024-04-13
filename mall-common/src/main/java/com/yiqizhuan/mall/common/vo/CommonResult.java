package com.yiqizhuan.mall.common.vo;

import com.yiqizhuan.mall.common.enums.ResponseCodeEnum;

import java.io.Serializable;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 12:24
 * @Description: 统一返回结果
 */
public class CommonResult<T> implements Serializable {

    private final int code;

    private final String msg;

    private final T data;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public CommonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonResult(ResponseCodeEnum codeEnum, T data) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMessage();
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data){
        return new CommonResult<>(ResponseCodeEnum.SUCCESS,data);
    }
    public static <T> CommonResult<T> success(){
        return new CommonResult<>(ResponseCodeEnum.SUCCESS,null);
    }

    public static <T> CommonResult<T> fail(int code,String msg){
        return new CommonResult<>(code,msg,null);
    }

    public static <T> CommonResult<T> fail(ResponseCodeEnum codeEnum){
        return new CommonResult<>(codeEnum.getCode(),codeEnum.getMessage(),null);
    }
}
