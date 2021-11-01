package lk.ijse.abccompany.spring.controller;

import lk.ijse.abccompany.spring.dto.CategoryDTO;
import lk.ijse.abccompany.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

        @Autowired
        private CategoryService categoryService;


        @PostMapping
        public String saveCategory(@RequestBody CategoryDTO dto) {
            boolean b = categoryService.addCategory(dto);
            return b + "";
        }

        @GetMapping
        public ArrayList<CategoryDTO> getAllCategory() {
            return categoryService.getAllCategory();
        }

        @GetMapping(path = "/{id}")
        public CategoryDTO searchCategory(@PathVariable String id) {
            return categoryService.searchCategory(id);
        }


        @DeleteMapping(params = {"id"})
        public String deleteCategory(@RequestParam String id) {
            boolean b = categoryService.deleteCategory(id);
            return b + "";
        }

        @PutMapping
        public String updateCategory(@RequestBody CategoryDTO dto) {
            boolean b = categoryService.updateCategory(dto);
            return b + "";
        }

}
