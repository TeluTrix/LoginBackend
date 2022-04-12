package ch.swisscom.loginbackend.services;

import ch.swisscom.loginbackend.entities.Role;
import ch.swisscom.loginbackend.entities.User;
import ch.swisscom.loginbackend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(Principal principal) {
        //System.out.println(principal);
        return userRepository.findAll();
    }
    public String createUser(User user){
        //user.setId(0L);
        user.setOrders(null);
        user.setRole(Role.USER);
        userRepository.save(user);
        return "User was created successfully";
    }
}
