/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLib.rawdatabase;

import com.eduLib.model.Bookss;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * author eugene
 */
@Remote
public interface LibraryBookssPersistentBeanRemote {

    void addBook(Bookss bookName);

    List<Bookss> getBooks();
}
