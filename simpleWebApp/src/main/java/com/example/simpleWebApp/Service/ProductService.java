package com.example.simpleWebApp.Service;

import com.example.simpleWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    List<Product> products = Arrays.asList(
            new Product(1,"Iphone",200),
            new Product(2,"Samsung", 199),
            new Product(3,"Redmi", 202)


    );
        public List<Product> getProducts(){
            return products;
        }
}
