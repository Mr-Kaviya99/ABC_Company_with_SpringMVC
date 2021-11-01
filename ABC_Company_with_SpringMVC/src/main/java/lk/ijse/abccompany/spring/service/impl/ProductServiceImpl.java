package lk.ijse.abccompany.spring.service.impl;

import lk.ijse.abccompany.spring.dto.ProductDTO;
import lk.ijse.abccompany.spring.entity.Product;
import lk.ijse.abccompany.spring.repo.ProductRepo;
import lk.ijse.abccompany.spring.service.ProductService;
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
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean addProduct(ProductDTO dto) {
        if (productRepo.existsById(dto.getProductId())) {
            throw new RuntimeException("Product Already Exist");
        }
        productRepo.save(mapper.map(dto, Product.class));
        return true;
    }

    @Override
    public boolean deleteProduct(String id) {
        productRepo.deleteById(id);
        return true;
    }

    @Override
    public ProductDTO searchProducts(String id) {
        Optional<Product> product = productRepo.findById(id);
        if (product.isPresent()) {
            return mapper.map(product.get(), ProductDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<ProductDTO> getAllProducts() {
        List<Product> all = productRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<ProductDTO>>() {
        }.getType());
    }

    @Override
    public boolean updateProducts(ProductDTO dto) {
        if (productRepo.existsById(dto.getProductId())) {
            productRepo.save(mapper.map(dto, Product.class));
            return true;
        }
        return false;
    }
}
