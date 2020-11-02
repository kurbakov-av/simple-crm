package com.example.crm.domain.event;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "events")
@Data
public abstract class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
