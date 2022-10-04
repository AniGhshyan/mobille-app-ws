package com.example.mobilleappws.ui.model.response;

import java.util.Date;

public class Errormessage {

    private Date timestamp;
    private String message;

    public Errormessage() {
    }

    public Errormessage(Date timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
