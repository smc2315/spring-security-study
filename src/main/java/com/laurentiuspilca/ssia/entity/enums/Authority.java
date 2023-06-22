package com.laurentiuspilca.ssia.entity.enums;

import com.laurentiuspilca.ssia.entity.User;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JoinColumn(name = "user")
    @ManyToOne
    private User user;
}
