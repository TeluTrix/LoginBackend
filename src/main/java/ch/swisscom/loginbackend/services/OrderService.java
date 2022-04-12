package ch.swisscom.loginbackend.services;

import ch.swisscom.loginbackend.entities.Order;
import ch.swisscom.loginbackend.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    public String createUser(Order order){
        orderRepository.save(order);
        return "Order successful!";
    }
    public boolean validateRole(String string){
        if("ADMIN" == string){
            return true;
        }
        else if("USER" == string){
            return true;
        }
        else{
            return false;
        }
    }
}
