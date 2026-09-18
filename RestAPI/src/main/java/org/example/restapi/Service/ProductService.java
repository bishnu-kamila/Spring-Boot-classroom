package org.example.restapi.Service;

import org.example.restapi.Model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> fetchAllProduct();

}
