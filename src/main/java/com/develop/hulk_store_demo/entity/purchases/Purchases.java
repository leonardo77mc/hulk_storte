package com.develop.hulk_store_demo.entity.purchases;

import com.develop.hulk_store_demo.entity.product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class Purchases {

    public Purchases() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int quantity;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    public Date createAt;
}
