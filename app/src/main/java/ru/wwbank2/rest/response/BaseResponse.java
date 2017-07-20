package ru.wwbank2.rest.response;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
public class BaseResponse {

    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
