package com.yiqizhuan.mall.common.enums;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 12:46
 * @Description:
 */
public enum ResponseCodeEnum {
    SUCCESS(200, "success"),
    BAD_REQUEST(400, "fail"),
    UNAUTHORIZED(401, "auth error"),
    INTERNAL_ERROR(500, "internal error"),
    NOT_ACCEPTABLE(406, "fail");

    private final int code;
    private final String message;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    private ResponseCodeEnum(final int code, final String message) {
        this.code = code;
        this.message = message;
    }
}
