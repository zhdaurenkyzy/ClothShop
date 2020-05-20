package com.epam.shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "USER_SHOP")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ROLE")
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "owner", cascade = {CascadeType.REMOVE})
    private List<Order> orders;

}
