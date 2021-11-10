package com.kozka.hospitaldepartmentservlet.entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Kozka Ivan
 */
public class User {
    private int id;

    private String email;
    private String pass;
    private String firstName;
    private String lastName;

    UserRole userRole;
    Specialization specialization;

    Boolean active;
    LocalDate birth;

    public User(
            int id, String email, String pass,
            String firstName, String lastName,
            UserRole userRole, Specialization specialization,
            Boolean active, LocalDate birth
    ) {
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
        this.specialization = specialization;
        this.active = active;
        this.birth = birth;
    }

    public User(
            String email, String pass,
            String firstName, String lastName,
            UserRole userRole, Specialization specialization,
            Boolean active, LocalDate birth
    ) {
        this.email = email;
        this.pass = pass;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRole = userRole;
        this.specialization = specialization;
        this.active = active;
        this.birth = birth;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!email.equals(user.email)) return false;
        if (!pass.equals(user.pass)) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!lastName.equals(user.lastName)) return false;
        if (userRole != user.userRole) return false;
        if (specialization != user.specialization) return false;
        if (!active.equals(user.active)) return false;

        return Objects.equals(birth, user.birth);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + email.hashCode();
        result = 31 * result + pass.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + userRole.hashCode();
        result = 31 * result + (specialization != null ? specialization.hashCode() : 0);
        result = 31 * result + active.hashCode();
        result = 31 * result + (birth != null ? birth.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userRole=" + userRole +
                ", specialization=" + specialization +
                ", active=" + active +
                ", birth=" + birth +
                '}';
    }
}
