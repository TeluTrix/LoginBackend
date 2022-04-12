package ch.swisscom.loginbackend.repositories;

import ch.swisscom.loginbackend.entities.Order;
import ch.swisscom.loginbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
