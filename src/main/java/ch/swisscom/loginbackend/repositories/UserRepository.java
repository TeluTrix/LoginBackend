package ch.swisscom.loginbackend.repositories;

import ch.swisscom.loginbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.Principal;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    /*public default List<User> findAllUsers(Principal principal){
        return []
    } */
}
