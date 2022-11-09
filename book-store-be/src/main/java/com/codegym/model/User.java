package com.codegym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    @Column(length = 60)
    private String password;
    @Column(length = 45)
    private String name;
    @Column(length = 15)
    private String phone;
    private Integer gender;
    private String address;
    private String avatar;
    private Integer money;
    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
    @JsonBackReference(value = "user_invoices")
    @OneToMany(mappedBy = "user")
    private List<Invoice> invoices;
    @OneToMany(mappedBy = "user")
    private List<Cart> carts;
}
