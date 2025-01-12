// Generated by delombok at Thu Dec 05 17:52:13 EST 2019
package com.starterkit.springboot.brs.controller.v1.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * Created by Arpit Khandelwal.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTripSchedulesRequest {
    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String sourceStop;
    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String destinationStop;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date tripDate;

    @java.lang.SuppressWarnings("all")
    public String getSourceStop() {
        return this.sourceStop;
    }

    @java.lang.SuppressWarnings("all")
    public String getDestinationStop() {
        return this.destinationStop;
    }

    @java.lang.SuppressWarnings("all")
    public Date getTripDate() {
        return this.tripDate;
    }

    @java.lang.SuppressWarnings("all")
    public GetTripSchedulesRequest setSourceStop(final String sourceStop) {
        this.sourceStop = sourceStop;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public GetTripSchedulesRequest setDestinationStop(final String destinationStop) {
        this.destinationStop = destinationStop;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public GetTripSchedulesRequest setTripDate(final Date tripDate) {
        this.tripDate = tripDate;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public GetTripSchedulesRequest() {
    }
}
