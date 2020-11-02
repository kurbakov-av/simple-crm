package com.example.crm.domain.product;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_services")
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductService extends Assortment {
}
