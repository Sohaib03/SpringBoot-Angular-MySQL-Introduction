package com.threedots.bookstore.repository;

import com.threedots.bookstore.model.BookShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShopRepository extends JpaRepository<BookShop, Long> {
//    BookShop findByTitleContainsIgnoreCase(String title);
}
