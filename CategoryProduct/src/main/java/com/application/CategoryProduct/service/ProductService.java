package com.application.CategoryProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.CategoryProduct.entity.Product;
import com.application.CategoryProduct.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    /*
    public Product updateProduct(Long id,Product product){
        Product existingProduct = productRepository.findById(id)
            .orElseThrow(()->
                new RuntimeException("Product with + "+id + "not present"));
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id){
        Product existingProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Course with +"+id +"not present"));
        productRepository.deleteById(id);
    }
    */
}
