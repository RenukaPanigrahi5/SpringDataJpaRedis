package com.library.api;

import com.library.dto.Book;

public interface BookService {
    Book addBook(Book book);



    Book getBook(long id);

    String deleteBook(long id);

}
