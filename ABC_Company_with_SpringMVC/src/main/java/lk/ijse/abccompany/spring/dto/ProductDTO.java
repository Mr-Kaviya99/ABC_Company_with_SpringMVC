package lk.ijse.abccompany.spring.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String productId;
    private String productName;
//    private String productImage;
    private String productType;
    private String productDesc;
    private double productprize;
}
