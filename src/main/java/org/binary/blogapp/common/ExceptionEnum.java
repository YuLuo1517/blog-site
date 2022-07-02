package org.binary.blogapp.common;

public enum ExceptionEnum {

    SUCCESS(2000, "success"),

    PARAM_EXCEPTION(4000,"error");

    private Integer code;
    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
