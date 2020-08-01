package com.brunocarvalho.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brunocarvalho.bookstoremanager.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
