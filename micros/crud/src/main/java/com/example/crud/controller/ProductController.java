package com.example.crud.controller;

import com.example.crud.model.Product;
import com.example.crud.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @PostMapping
    public void registrarProducto(Product producto){
        return productService.postProduct(producto);
    }

}
