package com.example.crm.domain;

import com.example.crm.domain.employer.Employer;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String number;

    private String fileUrl;

    @ManyToOne
    private Document parent;

    @NotNull
    private Date date;

    @ManyToOne(optional = false)
    private Employer createdBy;

    @ManyToOne(optional = false)
    private Employer updatedBy;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
