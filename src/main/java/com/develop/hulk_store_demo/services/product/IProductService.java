package com.develop.hulk_store_demo.services.product;

import com.develop.hulk_store_demo.entity.product.Product;

import java.util.List;

public interface IProductService {

    public List<Product> getProductList();

    public Product savePurchase(String lote, int quantity);

    public Product getProductByLote(String lote);

}
