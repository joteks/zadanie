package pl.slavek.zadanie;

import java.util.Objects;

public class User {

    private String invitee;
    private String email;

    public User() {}

    public User(String invitee, String email) {
        this.invitee = invitee;
        this.email = email;
    }

    public String getInvitee() {
        return invitee;
    }

    public void setInvitee(String invitee) {
        this.invitee = invitee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(invitee, user.invitee) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitee, email);
    }
}
