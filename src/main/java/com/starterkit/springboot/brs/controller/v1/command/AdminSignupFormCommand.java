// Generated by delombok at Thu Dec 05 17:52:13 EST 2019
package com.starterkit.springboot.brs.controller.v1.command;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by Arpit Khandelwal.
 */
public class AdminSignupFormCommand {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min = 5)
    private String password;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    @Size(min = 5, max = 100)
    private String agencyName;
    @NotBlank
    @Size(max = 100)
    private String agencyDetails;
    @NotBlank
    @Size(min = 5, max = 13)
    private String mobileNumber;

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand() {
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
    public String getAgencyName() {
        return this.agencyName;
    }

    @java.lang.SuppressWarnings("all")
    public String getAgencyDetails() {
        return this.agencyDetails;
    }

    @java.lang.SuppressWarnings("all")
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand setEmail(final String email) {
        this.email = email;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand setPassword(final String password) {
        this.password = password;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand setAgencyName(final String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand setAgencyDetails(final String agencyDetails) {
        this.agencyDetails = agencyDetails;
        return this;
    }

    @java.lang.SuppressWarnings("all")
    public AdminSignupFormCommand setMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof AdminSignupFormCommand)) return false;
        final AdminSignupFormCommand other = (AdminSignupFormCommand) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$email = this.getEmail();
        final java.lang.Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final java.lang.Object this$password = this.getPassword();
        final java.lang.Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final java.lang.Object this$firstName = this.getFirstName();
        final java.lang.Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final java.lang.Object this$lastName = this.getLastName();
        final java.lang.Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final java.lang.Object this$agencyName = this.getAgencyName();
        final java.lang.Object other$agencyName = other.getAgencyName();
        if (this$agencyName == null ? other$agencyName != null : !this$agencyName.equals(other$agencyName)) return false;
        final java.lang.Object this$agencyDetails = this.getAgencyDetails();
        final java.lang.Object other$agencyDetails = other.getAgencyDetails();
        if (this$agencyDetails == null ? other$agencyDetails != null : !this$agencyDetails.equals(other$agencyDetails)) return false;
        final java.lang.Object this$mobileNumber = this.getMobileNumber();
        final java.lang.Object other$mobileNumber = other.getMobileNumber();
        if (this$mobileNumber == null ? other$mobileNumber != null : !this$mobileNumber.equals(other$mobileNumber)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof AdminSignupFormCommand;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final java.lang.Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final java.lang.Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final java.lang.Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final java.lang.Object $agencyName = this.getAgencyName();
        result = result * PRIME + ($agencyName == null ? 43 : $agencyName.hashCode());
        final java.lang.Object $agencyDetails = this.getAgencyDetails();
        result = result * PRIME + ($agencyDetails == null ? 43 : $agencyDetails.hashCode());
        final java.lang.Object $mobileNumber = this.getMobileNumber();
        result = result * PRIME + ($mobileNumber == null ? 43 : $mobileNumber.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "AdminSignupFormCommand(email=" + this.getEmail() + ", password=" + this.getPassword() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", agencyName=" + this.getAgencyName() + ", agencyDetails=" + this.getAgencyDetails() + ", mobileNumber=" + this.getMobileNumber() + ")";
    }
}
