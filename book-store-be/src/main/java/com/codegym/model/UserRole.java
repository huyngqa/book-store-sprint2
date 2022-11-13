//package com.codegym.model;
//
//import com.codegym.model.composite.UserRoleKey;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class UserRole {
//    @EmbeddedId
//    private UserRoleKey id;
//    @ManyToOne
//    @MapsId("userId")
//    @JoinColumn(name = "user_id")
//    @JsonBackReference(value = "UserRole_user")
//    private User user;
//    @ManyToOne
//    @MapsId("roleId")
//    @JoinColumn(name = "id_role")
//    @JsonBackReference(value = "UserRole_role")
//    private Role role;
//}
