package com.example.test.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.test.dto.enums.ErrorCode;

public class ResponseDto<T> {

    private boolean success;
    private ErrorCode errorCode;
    private T data;
    private Message message;

    public ResponseDto() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseDto(boolean success, Message message, ErrorCode errorCode, T data) {
        this.success = success;
        this.errorCode = errorCode;
        this.data = data;
        this.message = message;
    }


    public static <T> ResponseDto<T> error(ErrorCode errorCode) {
        return new ResponseDto<>(false, message(errorCode), errorCode, null);
    }

    public static <T> ResponseDto<T> error(String error) {
        return new ResponseDto<>(false, message(error), null, null);
    }

    public static <T> ResponseDto<T> error(ErrorCode errorCode, T data) {
        return new ResponseDto<>(false, message(errorCode), errorCode, data);
    }

    private static Message message(ErrorCode errorCode) {
        return new Message(
                errorCode.getTr()
        );
    }

    private static Message message(String errorCode) {
        return new Message(
                errorCode
        );
    }

    public static <T> ResponseDto<T> success() {
        return new ResponseDto<>(true, message(ErrorCode.NONE), ErrorCode.NONE, null);
    }

    public static <T> ResponseDto<T> success(T data) {
        return new ResponseDto<>(true, message(ErrorCode.NONE), ErrorCode.NONE, data);
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public static class Message {
        private String tr;

        public String getTr() {
            return tr;
        }

        public Message() {
        }

        public Message(String tr) {
            this.tr = tr;
        }

        public void setTr(String tr) {
            this.tr = tr;
        }
    }
}
