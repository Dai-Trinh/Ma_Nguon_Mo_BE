package com.example.manguonmo_be.service.respone;

public class CommonResponse<T> {

    private Result result;

    private T data;

    private int dataCount;

    public CommonResponse success(){
        this.result = new Result("00", "OK", true);
        return this;
    }

    public CommonResponse data(T data){
        this.data = data;
        return this;
    }

    public CommonResponse dataCount(int dataCount){
        this.dataCount = dataCount;
        return this;
    }

}
