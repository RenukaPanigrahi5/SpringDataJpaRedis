package com.library.repository;

import com.library.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book,Long> {

}
