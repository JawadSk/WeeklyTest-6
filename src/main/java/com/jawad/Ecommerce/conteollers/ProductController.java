package com.jawad.Ecommerce.conteollers;

import com.jawad.Ecommerce.models.Product;
import com.jawad.Ecommerce.services.ProductService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping()
    public String addProducts(@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }

    @GetMapping()
    public List<Product> getProduct(@Nullable @RequestParam String category){
        return productService.getProduct(category);
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        return productService.deleteProduct(productId);
    }
}
