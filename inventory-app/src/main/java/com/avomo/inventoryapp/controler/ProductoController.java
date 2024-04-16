package com.avomo.inventoryapp.controler;

import com.avomo.inventoryapp.model.Producto;
import com.avomo.inventoryapp.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//localhost:8080/inventary-app
@RequestMapping("inventory-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoController {

    private static  final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> getProducts (){
        List<Producto> productos = this.productoService.listProducts();
        logger.info("Lista productos: ");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }
}


