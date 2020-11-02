package com.example.crm.domain.product.category;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_categories")
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductCategory extends Catalog {
}
