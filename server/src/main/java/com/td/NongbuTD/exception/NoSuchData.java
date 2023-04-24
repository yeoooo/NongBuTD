package com.td.NongbuTD.exception;

public class NoSuchData extends Throwable {
    String msg;
    public NoSuchData(String msg) {
        this.msg = "존재 하지 않는 " + msg + "입니다.";
    }
}
