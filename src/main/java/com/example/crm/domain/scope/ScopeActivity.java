package com.example.crm.domain.scope;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "scope_activities")
@Data
@EqualsAndHashCode(callSuper = true)
public class ScopeActivity extends Catalog {
}
