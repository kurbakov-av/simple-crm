package com.example.crm.domain.deal;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "deal_stages")
@Data
@EqualsAndHashCode(callSuper = true)
public class DealStage extends Catalog {
}
