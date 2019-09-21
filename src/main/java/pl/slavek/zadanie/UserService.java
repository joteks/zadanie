package pl.slavek.zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>(Arrays.asList(new User("John Smith", "john@smith.mx")));

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser() {
        users.remove(users.size() - 1);
    }

//    public void updateUser(String invitee, User user) {
//        for (int i = 0; i < users.size(); i++) {
//            User u = users.get(i);
//            if (u.getInvitee().equals(invitee)) {
//                users.set(i, user);
//                return;
//            }
//        }
//    }

}
