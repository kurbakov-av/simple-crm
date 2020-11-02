package com.example.crm.domain.product.manufacturer;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.country.Country;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "manufacturers")
@Data
@EqualsAndHashCode(callSuper = true)
public class Manufacturer extends Catalog {

    @NotNull
    private String code;

    @ManyToOne(optional = false)
    private Country country;

    @NotNull
    @Enumerated
    private State state;

    public enum State {
        NEW, USED;
    }
}
