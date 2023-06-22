package com.laurentiuspilca.ssia.entity;

import com.laurentiuspilca.ssia.entity.enums.Authority;
import com.laurentiuspilca.ssia.entity.enums.EncryptionAlgorithm;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private EncryptionAlgorithm algorithm;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Authority> authorities;

}
