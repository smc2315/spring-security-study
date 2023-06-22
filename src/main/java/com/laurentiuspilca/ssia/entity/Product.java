package com.laurentiuspilca.ssia.entity;

import com.laurentiuspilca.ssia.entity.enums.Currency;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private Currency currency;
}
