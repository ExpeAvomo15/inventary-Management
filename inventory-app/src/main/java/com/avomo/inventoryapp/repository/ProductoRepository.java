package com.avomo.inventoryapp.repository;

import com.avomo.inventoryapp.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
