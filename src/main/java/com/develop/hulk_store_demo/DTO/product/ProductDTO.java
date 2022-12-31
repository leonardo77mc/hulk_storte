package com.develop.hulk_store_demo.DTO.product;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDTO {
    private String lote;
    private int quantity;

    public ProductDTO(String lote, int quantity) {
        this.lote = lote;
        this.quantity = quantity;
    }
}
