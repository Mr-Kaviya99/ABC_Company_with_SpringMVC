package lk.ijse.abccompany.spring.service;

import lk.ijse.abccompany.spring.dto.CategoryDTO;

import java.util.ArrayList;

public interface CategoryService {

    boolean addCategory(CategoryDTO dto);

    boolean deleteCategory(String id);

    CategoryDTO searchCategory(String id);

    ArrayList<CategoryDTO> getAllCategory();

    boolean updateCategory(CategoryDTO dto);
}
