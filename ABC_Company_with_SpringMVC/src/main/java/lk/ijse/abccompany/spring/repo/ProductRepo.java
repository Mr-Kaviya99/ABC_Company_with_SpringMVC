package lk.ijse.abccompany.spring.repo;

import lk.ijse.abccompany.spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, String> {
}
