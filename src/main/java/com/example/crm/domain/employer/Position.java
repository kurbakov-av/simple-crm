package com.example.crm.domain.employer;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "positions")
@Data
@EqualsAndHashCode(callSuper = true)
public class Position extends Catalog {
}
