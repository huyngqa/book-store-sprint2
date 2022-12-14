package com.codegym.model.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CartKey implements Serializable {
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "book_id")
    private Integer bookId;
}
