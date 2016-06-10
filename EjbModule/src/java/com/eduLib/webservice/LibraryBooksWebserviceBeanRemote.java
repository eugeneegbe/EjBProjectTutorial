/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eduLib.webservice;

import com.eduLib.entities.Books;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * author eugene
 */
@Remote
public interface LibraryBooksWebserviceBeanRemote {
    
    void addBook(Books bookName);

    List<Books> getBooks();
    
}
