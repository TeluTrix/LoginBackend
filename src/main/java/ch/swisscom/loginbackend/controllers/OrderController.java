package ch.swisscom.loginbackend.controllers;

import ch.swisscom.loginbackend.entities.Order;
import ch.swisscom.loginbackend.entities.User;
import ch.swisscom.loginbackend.services.OrderService;
import ch.swisscom.loginbackend.services.ProductService;
import ch.swisscom.loginbackend.services.UserService;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;
    private final ProductService productService;

    @JsonCreator
    public OrderController(OrderService orderService, UserService userService, ProductService productService) {
        this.orderService = orderService;
        this.userService = userService;
        this.productService = productService;
    }
    @GetMapping
    public List<Order> getOrders(){
        return orderService.getAllOrders();
    }
    @PostMapping
    public String createOrder(@RequestBody Order order){
        if(orderService.validateRole(order.getPayment())){
            orderService.createUser(order);
            return "User successfully created!";
        }
        else{
            return "Error occurred while creating User.";
        }
    }
}
