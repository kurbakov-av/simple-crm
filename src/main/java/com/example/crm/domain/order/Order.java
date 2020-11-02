package com.example.crm.domain.order;

import com.example.crm.domain.Contact;
import com.example.crm.domain.Document;
import com.example.crm.domain.Money;
import com.example.crm.domain.contract.Contract;
import com.example.crm.domain.partner.Partner;
import com.example.crm.domain.product.Assortment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@EqualsAndHashCode(callSuper = true)
public class Order extends Document {

    @ManyToOne(optional = false)
    private Partner partner;

    @ManyToOne(optional = false)
    private Contract contract;

    @NotNull
    @Embedded
    private Contact contactPerson;

    @ElementCollection
    @CollectionTable(name = "order_lines")
    private List<Line> lines;

    @Data
    @Embeddable
    public static class Line {

        @ManyToOne(optional = false)
        private Assortment product;

        @NotNull
        @Embedded
        private Money money;

        @NotNull
        @PositiveOrZero
        private Integer quantity;
    }
}
