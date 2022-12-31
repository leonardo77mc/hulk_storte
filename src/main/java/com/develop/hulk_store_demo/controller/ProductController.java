package com.develop.hulk_store_demo.controller;

import com.develop.hulk_store_demo.DTO.product.ProductDTO;
import com.develop.hulk_store_demo.entity.product.Product;
import com.develop.hulk_store_demo.services.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class ProductController {

    @Autowired
    private IProductService productService;

    /**
     * Metodo para obtener la lista de productos
     * @return List<Product>
     */
    @GetMapping("allProduct")
    List<Product> listProduct() {
        try {
            return productService.getProductList();
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Metodo para guardar una compra
     * @param productDTO
     * @return Product
     */
    @PostMapping("savePurchase")
    Product getProductByReference(@RequestBody() ProductDTO productDTO) {
        try {
            return productService.savePurchase(productDTO.getLote(), productDTO.getQuantity());
        } catch (Exception e) {
            throw e;
        }
    }

}
