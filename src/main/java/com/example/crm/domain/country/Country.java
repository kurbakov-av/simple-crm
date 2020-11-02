package com.example.crm.domain.country;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
@Data
@EqualsAndHashCode(callSuper = true)
public class Country extends Catalog {
}
