package pl.slavek.zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
    public class MyController {

        @Autowired
        private UserService userService;

        @GetMapping("/invitation")
        public List<User> getUser() {
            return userService.getUsers();
        }

        @ResponseStatus(HttpStatus.CREATED)
        @PostMapping("/invitation")
        public void addUser(@RequestBody User user) {
            userService.addUser(user);
        }

        @DeleteMapping("/invitation")
        public void deleteUser(String invetee) {
            userService.deleteUser(invetee);
        }

}
