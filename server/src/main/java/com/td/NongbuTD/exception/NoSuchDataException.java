package com.td.NongbuTD.exception;

public class NoSuchDataException extends Throwable {
    String msg;
    public NoSuchDataException(String msg) {
        this.msg = "존재 하지 않는 " + msg + "입니다.";
    }
}
