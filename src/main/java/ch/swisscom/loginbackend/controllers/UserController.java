package ch.swisscom.loginbackend.controllers;

import ch.swisscom.loginbackend.entities.User;
import ch.swisscom.loginbackend.services.OrderService;
import ch.swisscom.loginbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final OrderService orderService;

    @Autowired
    public UserController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder, OrderService orderService) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.orderService = orderService;
    }
    @GetMapping
    public List<User> getUsers(Principal principal) throws Exception{
        return userService.getAllUsers(principal);
    }
    @PostMapping()
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
