package org.example.restapi.Model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product_Details")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    @Column(name = "productName")
    private String productName;
    @Column(name = "productType")
    private String productType;
    @Column(name = "productPrice")
    private double productPrice;

}
