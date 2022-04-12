package ch.swisscom.loginbackend.controllers;

import ch.swisscom.loginbackend.entities.Order;
import ch.swisscom.loginbackend.services.OrderService;
import ch.swisscom.loginbackend.services.ProductService;
import ch.swisscom.loginbackend.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;
    private final ProductService productService;

    public OrderController(OrderService orderService, UserService userService, ProductService productService) {
        this.orderService = orderService;
        this.userService = userService;
        this.productService = productService;
    }
    @GetMapping
    public List<Order> getOrders(){
        orderService.
    }
}
