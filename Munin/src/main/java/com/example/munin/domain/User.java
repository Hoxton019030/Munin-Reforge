package com.example.munin.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Hoxton on 2022/12/12
 * @since 1.2.0
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    @ManyToMany
    private Collection<Role> role = new ArrayList<>();

}
