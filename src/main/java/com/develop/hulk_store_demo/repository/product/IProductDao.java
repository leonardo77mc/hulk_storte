package com.develop.hulk_store_demo.repository.product;

import com.develop.hulk_store_demo.entity.product.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface IProductDao extends CrudRepository<Product, Long> {

    @Query("select p from Product p WHERE p.lote=:lote")
    @Transactional(readOnly = true)
    public Product getProductByLote(String lote);
}
