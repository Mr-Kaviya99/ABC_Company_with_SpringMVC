package lk.ijse.abccompany.spring.controller;


import lk.ijse.abccompany.spring.dto.ProductDTO;
import lk.ijse.abccompany.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping
    public String saveProducts(@RequestBody ProductDTO dto) {
        boolean b = productService.addProduct(dto);
        return b + "";
    }

    @GetMapping
    public ArrayList<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(path = "/{id}")
    public ProductDTO searchProducts(@PathVariable String id) {
        return productService.searchProducts(id);
    }


    @DeleteMapping(params = {"id"})
    public String deleteProducts(@RequestParam String id) {
        boolean b = productService.deleteProduct(id);
        return b + "";
    }

    @PutMapping
    public String updateProducts(@RequestBody ProductDTO dto) {
        boolean b = productService.updateProducts(dto);
        return b + "";
    }
}
