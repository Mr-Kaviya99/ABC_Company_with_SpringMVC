package lk.ijse.abccompany.spring.service;

import lk.ijse.abccompany.spring.dto.AdminDTO;

import java.util.ArrayList;

public interface AdminService {

    boolean addAdmin(AdminDTO dto);

    boolean deleteAdmin(String id);

    AdminDTO searchAdmin(String id);

    ArrayList<AdminDTO> getAllAdmin();

    boolean updateAdmin(AdminDTO dto);

}
