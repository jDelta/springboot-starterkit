// Generated by delombok at Thu Dec 05 17:52:13 EST 2019
package com.starterkit.springboot.brs.model.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Set;

/**
 * Created by Arpit Khandelwal.
 */
@Document(collection = "user")
public class User {
    @Id
    private String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    @DBRef
    private Set<Role> roles;

    public String getFullName() {
        return firstName != null ? firstName.concat(" ").concat(lastName) : "";
    }

    @java.lang.SuppressWarnings("all")
    public String getId() {
        return this.id;
    }

    @java.lang.SuppressWarnings("all")
    public String getEmail() {
        return this.email;
    }

    @java.lang.SuppressWarnings("all")
    public String getPassword() {
        return this.password;
    }

    @java.lang.SuppressWarnings("all")
    public String getFirstName() {
        return this.firstName;
    }

    @java.lang.SuppressWarnings("all")
    public String getLastName() {
        return this.lastName;
    }

    @java.lang.SuppressWarnings("all")
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    @java.lang.SuppressWarnings("all")
    public Set<Role> getRoles() {
        return this.roles;
    }

    @java.lang.SuppressWarnings("all")
    public User setId(final String id) {
        this.id = id;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public User setEmail(final String email) {
        this.email = email;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public User setPassword(final String password) {
        this.password = password;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public User setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public User setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public User setMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public User setRoles(final Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public User() {
    }
}
