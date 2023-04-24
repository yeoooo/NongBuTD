package com.td.NongbuTD.util;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse<T> {
    private int status;
    private T data;

    public ApiResponse(int status, T data) {
       this.status = status;
        this.data = data;
    }

    public static <T> ApiResponse<T> ok(T data) {
        return new ApiResponse<>(200, data);
    }

    public static <T> ApiResponse<T> fail(int status, T errData) {
        return new ApiResponse<>(status, errData);
    }
}
