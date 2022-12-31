package com.develop.hulk_store_demo.services.product;

import com.develop.hulk_store_demo.entity.product.Product;
import com.develop.hulk_store_demo.entity.purchases.Purchases;
import com.develop.hulk_store_demo.repository.product.IProductDao;
import com.develop.hulk_store_demo.services.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImplement implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> getProductList() {
        return (List<Product>) productDao.findAll();
    }

    @Override
    public Product savePurchase(String lote, int quantity) {
        Product product = productDao.getProductByLote(lote);
        int stock = product.getStock() - quantity;
        if(stock > 0) {
            product.setStock(stock);
            Purchases purchases = new Purchases();
            purchases.setQuantity(quantity);
            purchases.setCreateAt(new Date());
            product.getPurchases().add(purchases);
        }
        return productDao.save(product);
    }

    @Override
    public Product getProductByLote(String lote) {
        return productDao.getProductByLote(lote);
    }
}
