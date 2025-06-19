package com.example.client_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product-service") // nombre del servicio en Eureka
public interface ProductClient {

    @GetMapping("/products")
    List<String> getProducts();
}

