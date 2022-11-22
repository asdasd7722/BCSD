package org.example.controller;


import org.example.domain.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public String createUser(@RequestBody User user) {
        userService.createUser(user);

        return "create user";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User UserInfo(@PathVariable("id") Long id) {
        return userService.getUserInfo(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@RequestBody User user, @PathVariable("id") Long id) {
        userService.updateUserInfo(user, id);
        return "update user";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "delete user";
    }

}
