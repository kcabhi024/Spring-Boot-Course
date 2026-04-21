package com.example.simpleWebApp.Controller;

import com.example.simpleWebApp.Model.Product;
import com.example.simpleWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProducts(){
        return service.getProducts();

    }

    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }


    @PostMapping("/product")
    public  void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    @DeleteMapping("/product/{prodId}")
    public  void  deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
    @GetMapping("/test")
    public String test(){
        return "OK";
    }
}
