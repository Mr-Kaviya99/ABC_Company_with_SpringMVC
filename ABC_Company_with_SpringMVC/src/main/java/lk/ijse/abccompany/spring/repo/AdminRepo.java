package lk.ijse.abccompany.spring.repo;

import lk.ijse.abccompany.spring.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, String> {
}
