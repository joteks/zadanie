package pl.slavek.zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
    public class MyController {

        @Autowired
        private UserService userService;

        @RequestMapping(method = RequestMethod.GET, value = "/invitation")
        public List<User> getUser() {
            return userService.getUsers();
        }

        @ResponseStatus(HttpStatus.CREATED)
        @RequestMapping(method = RequestMethod.POST, value = "/invitation")
        public void addUser(@RequestBody User user) {
            userService.addUser(user);
        }

        @RequestMapping(method = RequestMethod.DELETE, value = "/invitation")
        public void deleteUser() {
            userService.deleteUser();
        }
//        @RequestMapping(method = RequestMethod.PUT, value = "/invitation/{id}")
//        public void updateTopic(@RequestBody User user, @PathVariable String id) {
//            userService.updateUser(id, user);
//        }
//
//@RequestMapping("/getInfo")
//@ResponseBody
//public String implicitTransfer(HttpServletRequest request) {
//    String browserName = request.getHeader("User-Agent");
//    String ipAddress = request.getRemoteAddr();
//    return "Browser name: " + browserName + System.lineSeparator() +
//            "IP address: " + ipAddress;
//}

}
