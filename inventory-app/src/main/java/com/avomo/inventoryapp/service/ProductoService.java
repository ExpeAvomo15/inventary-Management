package com.avomo.inventoryapp.service;

import com.avomo.inventoryapp.model.Producto;
import com.avomo.inventoryapp.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoServicio{

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> listProducts() {
        return this.productoRepository.findAll();
    }

    @Override
    public Producto buscarProductById(Integer idProducto) {
        return this.productoRepository.findById(idProducto).orElse(null);
    }

    @Override
    public void saveProduct(Producto producto) {
        this.productoRepository.save(producto);
    }

    @Override
    public void eliminarProductById(Integer idProducto) {
        this.productoRepository.deleteById(idProducto);
    }
}
