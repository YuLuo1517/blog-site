package org.binary.blogapp.common;

import java.io.Serializable;

public class RestApiResponse<T extends Serializable> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    private RestApiResponse() {

    }

    private RestApiResponse(ExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }

    private RestApiResponse(ExceptionEnum exceptionEnum, T data) {
        this.data = data;
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }


    public static <T extends Serializable> RestApiResponse<T> success(T data) {

        RestApiResponse<T> restApiResponse = new RestApiResponse<T>(ExceptionEnum.SUCCESS, data);
        return restApiResponse;
    }


    public static <T extends Serializable> RestApiResponse<T> success() {
        RestApiResponse<T> restApiResponse = new RestApiResponse<T>(ExceptionEnum.SUCCESS);

        return restApiResponse;
    }

    /**
     * 返回
     *
     * @param <T>
     * @return
     */
    public static <T extends Serializable> RestApiResponse<T> error(ExceptionEnum exceptionEnum) {
        RestApiResponse<T> restApiResponse = new RestApiResponse<>(exceptionEnum);
        return restApiResponse;
    }
}
