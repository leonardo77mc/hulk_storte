package com.develop.hulk_store_demo.controller;

import com.develop.hulk_store_demo.entity.product.Product;
import com.develop.hulk_store_demo.entity.purchases.Purchases;
import com.develop.hulk_store_demo.services.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/store")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class StoreController {

    @Autowired
    private IProductService productService;

    /**
     * Metodo para obtener la lista de compras, relacionadas a un lote de productos
     * @param lote
     * @return Product
     */
    @GetMapping("allPurchase")
    Product getListPurchaseById(@RequestParam(name = "lote") String lote) {
        return this.productService.getProductByLote(lote);
    }
}
