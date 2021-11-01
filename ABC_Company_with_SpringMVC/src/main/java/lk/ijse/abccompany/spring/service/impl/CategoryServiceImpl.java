package lk.ijse.abccompany.spring.service.impl;


import lk.ijse.abccompany.spring.dto.CategoryDTO;
import lk.ijse.abccompany.spring.entity.Category;
import lk.ijse.abccompany.spring.repo.CategoryRepo;
import lk.ijse.abccompany.spring.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean addCategory(CategoryDTO dto) {
        if (categoryRepo.existsById(dto.getCgId())) {
            throw new RuntimeException("Category Already Exist");
        }
        categoryRepo.save(mapper.map(dto, Category.class));
        return true;
    }

    @Override
    public boolean deleteCategory(String id) {
        categoryRepo.deleteById(id);
        return true;
    }

    @Override
    public CategoryDTO searchCategory(String id) {
        Optional<Category> category = categoryRepo.findById(id);
        if (category.isPresent()) {
            return mapper.map(category.get(), CategoryDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CategoryDTO> getAllCategory() {
        List<Category> all = categoryRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CategoryDTO>>() {
        }.getType());
    }

    @Override
    public boolean updateCategory(CategoryDTO dto) {
        if (categoryRepo.existsById(dto.getCgId())) {
            categoryRepo.save(mapper.map(dto, Category.class));
            return true;
        }
        return false;
    }
}
