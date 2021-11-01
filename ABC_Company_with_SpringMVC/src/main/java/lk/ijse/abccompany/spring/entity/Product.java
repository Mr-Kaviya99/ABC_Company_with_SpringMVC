package lk.ijse.abccompany.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String productId;
    private String productName;
//    private String productImage;
    private String productType;
    private String productDesc;
    private double productUnitprize;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cgId", referencedColumnName = "cgId",nullable = false)
    private Category cgId;
}
