package com.example.crm.domain.product;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.product.category.ProductCategory;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.EAN;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class Assortment extends Catalog {

    @ManyToOne(optional = false)
    private ProductCategory productCategory;

    @NotNull
    private String articleNumber;

    @EAN(type = EAN.Type.EAN13)
    private String ean13;

    @NotNull
    private UOM uom;

    private String description;
}
