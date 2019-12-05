// Generated by delombok at Thu Dec 05 17:52:13 EST 2019
package com.starterkit.springboot.brs.model.bus;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Arpit Khandelwal.
 */
@Document(collection = "stop")
public class Stop {
    @Id
    private String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String code;
    private String name;
    private String detail;

    @java.lang.SuppressWarnings("all")
    public String getId() {
        return this.id;
    }

    @java.lang.SuppressWarnings("all")
    public String getCode() {
        return this.code;
    }

    @java.lang.SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @java.lang.SuppressWarnings("all")
    public String getDetail() {
        return this.detail;
    }

    @java.lang.SuppressWarnings("all")
    public Stop setId(final String id) {
        this.id = id;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public Stop setCode(final String code) {
        this.code = code;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public Stop setName(final String name) {
        this.name = name;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public Stop setDetail(final String detail) {
        this.detail = detail;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public Stop() {
    }
}
