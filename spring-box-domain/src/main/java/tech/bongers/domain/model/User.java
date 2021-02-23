package tech.bongers.domain.model;

import java.util.Random;

public class User {

    private final Long userId;
    private final String firstName;
    private final String lastName;
    private final String emailAddress;

    public User(final String firstName, final String lastName, final String emailAddress) {
        this.userId = new Random().nextLong();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
