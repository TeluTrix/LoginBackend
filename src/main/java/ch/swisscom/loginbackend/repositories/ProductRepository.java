package ch.swisscom.loginbackend.repositories;

import ch.swisscom.loginbackend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
