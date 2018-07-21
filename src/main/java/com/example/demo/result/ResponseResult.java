package com.example.demo.result;

/**
 * @Describe
 * @Author Corey
 * @Date 2018/7/4.
 */
public class ResponseResult {
    private int code;
    private Exception exception;
    private String msg;

    public ResponseResult(int code, Exception exception) {
        this.code = code;
        this.exception = exception;
    }
    public ResponseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
