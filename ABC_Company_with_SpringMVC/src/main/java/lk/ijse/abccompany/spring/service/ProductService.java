package lk.ijse.abccompany.spring.service;

import lk.ijse.abccompany.spring.dto.ProductDTO;

import java.util.ArrayList;

public interface ProductService {

    boolean addProduct(ProductDTO dto);

    boolean deleteProduct(String id);

    ProductDTO searchProducts(String id);

    ArrayList<ProductDTO> getAllProducts();

    boolean updateProducts(ProductDTO dto);
}
