/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLib.persistence;

import com.eduLib.entities.BookBlob;
import com.eduLib.entities.BookEmbeddable;
import javax.ejb.Remote;
import com.eduLib.entities.Books;
import java.util.List;

/**
 *
 * author eugene
 */
@Remote
public interface LibraryPersistentBeanRemote {

    void addBook(Books bookName);

    List<Books> getBooks();
    
    void addBookEmbeddable(BookEmbeddable bookName);

    List<BookEmbeddable> getBookEmbeddable();

    void addBookBlob(BookBlob book);

    List<BookBlob> getBookBlob();
}
