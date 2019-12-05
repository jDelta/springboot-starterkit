// Generated by delombok at Thu Dec 05 17:52:13 EST 2019
package com.starterkit.springboot.brs.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;

/**
 * Created by Arpit Khandelwal
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseError {
    private Date timestamp;
    private String message;
    private String details;

    @java.lang.SuppressWarnings("all")
    public Date getTimestamp() {
        return this.timestamp;
    }

    @java.lang.SuppressWarnings("all")
    public String getMessage() {
        return this.message;
    }

    @java.lang.SuppressWarnings("all")
    public String getDetails() {
        return this.details;
    }

    @java.lang.SuppressWarnings("all")
    public ResponseError setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public ResponseError setMessage(final String message) {
        this.message = message;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public ResponseError setDetails(final String details) {
        this.details = details;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public ResponseError() {
    }
}
