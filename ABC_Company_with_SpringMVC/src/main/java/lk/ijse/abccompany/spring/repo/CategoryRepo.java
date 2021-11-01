package lk.ijse.abccompany.spring.repo;

import lk.ijse.abccompany.spring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, String> {
}
