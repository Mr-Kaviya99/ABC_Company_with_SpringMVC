package lk.ijse.abccompany.spring.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    private String cgId;
    private String cgName;

    @OneToMany(mappedBy = "cgId",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Product> productList = new ArrayList<>();
}
