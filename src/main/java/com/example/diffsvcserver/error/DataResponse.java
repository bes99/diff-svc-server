package com.example.diffsvcserver.error;

import lombok.Getter;

@Getter
public class DataResponse<T> extends BaseResponse{
    private T data;

    public DataResponse(T data) {
        super();
        this.data = data;
    }
}
