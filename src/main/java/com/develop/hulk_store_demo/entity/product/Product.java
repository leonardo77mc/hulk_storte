package com.develop.hulk_store_demo.entity.product;

import com.develop.hulk_store_demo.entity.purchases.Purchases;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String article;

    @Column
    private String reference;

    @Column
    private String providers;

    @Column
    private String measure;

    @Column
    private int price;

    @Column
    private String lote;

    @Column
    private int stock;

    @Column(name = "create_at")
    private String createAt;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "id_product")
    private List<Purchases> purchases;

    public Product() {
        this.purchases = new ArrayList<>();
    }

    private static final long serialVersionUID = 2L;
}
