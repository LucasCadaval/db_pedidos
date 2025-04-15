package com.lucas.db_pedidos.services;

import com.lucas.db_pedidos.entities.Brand;
import com.lucas.db_pedidos.repositories.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    public Brand getById(Long id) {
        return brandRepository.findById(id).orElse(null);
    }

    public Brand add(Brand brand) {
        return brandRepository.save(brand);
    }

    public Brand update(Long id, Brand brand) {
        Optional<Brand> brandOptional = brandRepository.findById(id);
        if (brandOptional.isPresent()) {
            Brand brandToUpdate = brandOptional.get();

            brandToUpdate.setName(brand.getName());
            brandToUpdate.setSite(brand.getSite());
            brandToUpdate.setPhone(brand.getPhone());
            return brandRepository.save(brandToUpdate);
        }
        return null;
    }

    public void delete(Long id) {
        brandRepository.deleteById(id);
    }

}
