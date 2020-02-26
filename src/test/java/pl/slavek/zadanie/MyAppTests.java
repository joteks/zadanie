package pl.slavek.zadanie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyAppTests {

    @Test
    public void shouldReturnJohnSmithByDefault() {
        //given
        UserService us = new UserService();

        //when
        List<User> users = us.getUsers();

        //then
        assertEquals(1, users.size());
        User firstUser = users.get(0);
        assertEquals(firstUser.getInvitee(), "John Smith");
    }

    @Test
    public void shouldCorrectlyAddNewUser() {
        //given
        UserService us = new UserService();
        User addedUser = new User("Jan Kowalski", "jkowalski@o2.pl");

        //when
        us.addUser(addedUser);
        List<User> users = us.getUsers();

        //then
        assertEquals(2, users.size());
        User returnedUser = users.get(1);
        assertEquals(addedUser, returnedUser);

        assertEquals("Jan Kowalski", returnedUser.getInvitee());
        assertEquals("jkowalski@o2.pl", returnedUser.getEmail());
    }

    @Test
    public void shouldCorrectlyDeleteUser() {
        //given
        UserService us = new UserService();
        User addedUser = new User("Jan Kowalski", "jkowalski@o2.pl");

        //when
        us.addUser(addedUser);
        List<User> users = us.getUsers();

        //then
        assertEquals(2, users.size());
        User returnedUser = users.get(1);
        assertEquals("Jan Kowalski", returnedUser.getInvitee());
        assertEquals("jkowalski@o2.pl", returnedUser.getEmail());

        //and when
        us.deleteUser("Jan Kowalski");
        List<User> usersAfterDeletion = us.getUsers();

        //then
        assertEquals(1, users.size());


    }

}
