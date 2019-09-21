package pl.slavek.zadanie;

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
}
