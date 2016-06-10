/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLib.persistence;

import com.eduLib.entities.BookBlob;
import com.eduLib.entities.BookEmbeddable;
import com.eduLib.entities.Books;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
//import javax.persistence.TypedQuery;

/**
 *
 * author eugene
 */
@Stateless
public class LibraryPersistentBean implements LibraryPersistentBeanRemote {

    public LibraryPersistentBean() {
    }

    @PersistenceContext(unitName = "EjbModulePU")
    private EntityManager entityManager;

    public void addBook(Books book) {
        entityManager.persist(book);
    }

    public List<Books> getBooks() {

        Query q2 = entityManager.createQuery("SELECT b FROM Books b");
        return q2.getResultList();

    }

    

    public void addBookEmbeddable(BookEmbeddable book) {
        entityManager.persist(book);
            
    }

    public List<BookEmbeddable> getBookEmbeddable() {
        Query q2 = entityManager.createQuery("SELECT b FROM BookEmbeddable b");
        return q2.getResultList();
    }
    
    public void addBookBlob(BookBlob book) {
        
        entityManager.persist(book);
    }

    public List<BookBlob> getBookBlob() {
        Query q2 = entityManager.createQuery("SELECT b FROM BookBlob b");
        return q2.getResultList();

    }
    
    /**
     * Providing support for CallBack Annotations
     */
    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct:: LibraryPersistentBean session bean"
                + " created with entity Manager object: ");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy: LibraryPersistentBean session"
                + " bean is removed ");
    }

    

}
