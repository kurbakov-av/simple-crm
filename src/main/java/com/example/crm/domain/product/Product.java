package com.example.crm.domain.product;

import com.example.crm.domain.product.manufacturer.Manufacturer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
@EqualsAndHashCode(callSuper = true)
public class Product extends Assortment {

    private Integer packaging;

    private BigDecimal netWeight;

    private BigDecimal grossWeight;

    @ManyToOne(optional = false)
    private Manufacturer manufacturer;
}
