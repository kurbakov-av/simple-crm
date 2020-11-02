package com.example.crm.domain.task;

import com.example.crm.domain.employer.Employer;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min = 1)
    private String title;

    @Column(length = 5000)
    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Priority priority = Priority.MEDIUM;

    private Date deadline;

    @ManyToOne(optional = false)
    private Employer responsible;

    @ManyToOne(optional = false)
    private Employer createdBy;

    @ManyToOne(optional = false)
    private Employer updatedBy;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    public enum Priority {
        LOW, MEDIUM, HIGH, CRITICAL;
    }
}
