package com.lottery.app.config;

public class ResponseEntity {
    //返回编码
    private String msgCode;

    //返回信息
    private String message;

    //返回的数据
    private Object data;

    public ResponseEntity(String msgCode, String message, Object data) {
        this.msgCode = msgCode;
        this.message = message;
        this.data = data;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "msgCode='" + msgCode + '\'' +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
