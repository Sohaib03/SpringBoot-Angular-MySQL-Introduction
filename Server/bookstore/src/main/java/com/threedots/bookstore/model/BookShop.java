package com.threedots.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="BookShop")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookShop implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shop_id;

    private String shop_name;
    private String location;

    @ManyToMany
    @JoinTable(
            name = "book_bookshop",
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            joinColumns = @JoinColumn(name = "shop_id", referencedColumnName = "shop_id"))
    private List<Book> bookList;
    private String contact_no;

}
