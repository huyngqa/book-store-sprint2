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
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, length = 45)
    private String author;
    @Column(length = 45)
    private String translator;
    @Column(nullable = false, length = 45)
    private String publishingCompany;
    private Integer numPage;
    @Column(length = 45)
    private String size;
    private Integer price;
    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToMany
    @JoinTable(name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;
    @JsonBackReference(value = "book_invoiceDetails")
    @OneToMany(mappedBy = "book")
    private List<InvoiceDetail> invoiceDetails;
    @OneToMany(mappedBy = "book")
    @JsonBackReference(value = "book_carts")
    private List<Cart> carts;

}
