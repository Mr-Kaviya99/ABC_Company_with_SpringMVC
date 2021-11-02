package lk.ijse.abccompany.spring.controller;


import lk.ijse.abccompany.spring.dto.AdminDTO;
import lk.ijse.abccompany.spring.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;


    @PostMapping
    public String saveAdmin(@RequestBody AdminDTO dto) {
        boolean b = adminService.addAdmin(dto);
        return b + "";
    }

    @GetMapping
    public ArrayList<AdminDTO> getAllAdmin() {
        return adminService.getAllAdmin();
    }

    @GetMapping(path = "/{id}")
    public AdminDTO searchAdmin(@PathVariable String id) {
        return adminService.searchAdmin(id);
    }


    @DeleteMapping(params = {"id"})
    public String deleteAdmin(@RequestParam String id) {
        boolean b = adminService.deleteAdmin(id);
        return b + "";
    }

    @PutMapping
    public String updateAdmin(@RequestBody AdminDTO dto) {
        boolean b = adminService.updateAdmin(dto);
        return b + "";
    }

}
