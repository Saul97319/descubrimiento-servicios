package com.example.client_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.client_service.client.ProductClient;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ProductClient productClient;

    public ClientController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("/products")
    public List<String> getProductsFromProvider() {
        return productClient.getProducts();
    }

    @GetMapping("/")
    public String home() {
        return "El cliente está corriendo correctamente.";
    }
}
