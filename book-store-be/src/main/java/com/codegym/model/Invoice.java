package com.codegym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private LocalDateTime exportDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @JsonBackReference(value = "invoice_invoiceDetails")
    @OneToMany(mappedBy = "invoice")
    private List<InvoiceDetail> invoiceDetails;
}
