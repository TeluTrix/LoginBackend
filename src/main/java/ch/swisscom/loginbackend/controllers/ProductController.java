package ch.swisscom.loginbackend.controllers;

import ch.swisscom.loginbackend.entities.Product;
import ch.swisscom.loginbackend.services.OrderService;
import ch.swisscom.loginbackend.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final OrderService orderService;

    public ProductController(ProductService productService, OrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }
    @GetMapping
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
    @PostMapping
    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
