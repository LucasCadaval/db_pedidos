package com.lucas.db_pedidos.controllers;

import com.lucas.db_pedidos.entities.Brand;
import com.lucas.db_pedidos.services.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    private final BrandService brandService;

    public BrandController (BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/get")
    public List<Brand> get(Brand brand) {
        return brandService.getAll();
    }

    @GetMapping("/get/{id}")
    public Brand getById(@PathVariable Long id) {
        return brandService.getById(id);
    }

    @PostMapping("/add")
    public Brand add(@RequestBody Brand brand) {
        return brandService.add(brand);
    }

    @PutMapping("/update/{id}")
    public Brand update(@PathVariable Long id,@RequestBody Brand brand) {
        return brandService.update(id, brand);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        brandService.delete(id);
    }
}
