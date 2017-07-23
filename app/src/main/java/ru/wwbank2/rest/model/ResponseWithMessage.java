package ru.wwbank2.rest.model;

/**
 * Created by a.smirnov19 on 23/07/2017.
 */
public class ResponseWithMessage {
    private final String message;

    public ResponseWithMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
