package org.example.restapi.Service;

import org.example.restapi.Model.Product;
import org.example.restapi.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImlementation implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImlementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> fetchAllProduct() {
        return productRepository.findAll();
    }
}
