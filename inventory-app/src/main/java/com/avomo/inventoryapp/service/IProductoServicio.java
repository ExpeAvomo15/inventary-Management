package com.avomo.inventoryapp.service;

import com.avomo.inventoryapp.model.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listProducts ();
    public Producto buscarProductById (Integer idProducto);
    public void saveProduct (Producto producto);
    public void eliminarProductById (Integer idProducto);
}
