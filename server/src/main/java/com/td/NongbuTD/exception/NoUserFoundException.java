package com.td.NongbuTD.exception;

public class NoUserFoundException extends Throwable{

    private String msg;
    public NoUserFoundException(String message) {
        super(message);
    }
    public NoUserFoundException() {
        this.msg = "유저를 찾을 수 없습니다";
    }
}
