// Generated by delombok at Thu Dec 05 17:52:13 EST 2019
package com.starterkit.springboot.brs.dto.model.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Arpit Khandelwal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto {
    private String role;

    @java.lang.SuppressWarnings("all")
    public String getRole() {
        return this.role;
    }

    @java.lang.SuppressWarnings("all")
    public RoleDto setRole(final String role) {
        this.role = role;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public RoleDto() {
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "RoleDto(role=" + this.getRole() + ")";
    }
}
