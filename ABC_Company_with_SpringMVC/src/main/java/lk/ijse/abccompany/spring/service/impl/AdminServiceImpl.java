package lk.ijse.abccompany.spring.service.impl;

import lk.ijse.abccompany.spring.dto.AdminDTO;
import lk.ijse.abccompany.spring.repo.AdminRepo;
import lk.ijse.abccompany.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;


@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean addAdmin(AdminDTO dto) {
        return false;
    }

    @Override
    public boolean deleteAdmin(String id) {
        return false;
    }

    @Override
    public AdminDTO searchAdmin(String id) {
        return null;
    }

    @Override
    public ArrayList<AdminDTO> getAllAdmin() {
        return null;
    }

    @Override
    public boolean updateAdmin(AdminDTO dto) {
        return false;
    }
}
