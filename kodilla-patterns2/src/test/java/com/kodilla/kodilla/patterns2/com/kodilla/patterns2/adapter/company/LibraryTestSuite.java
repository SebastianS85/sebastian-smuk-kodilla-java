package com.kodilla.kodilla.patterns2.com.kodilla.patterns2.adapter.company;

import com.kodilla.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void medianTestSuite(){

        Set<Book> bookSet=new HashSet<>();
        Book book1=new Book("author1","title 1",2007,"ab");
        Book book2=new Book("author2","title 2",1985,"abcc");
        Book book3=new Book("author3","title 3",1496,"abtt");
        Book book5=new Book("author3","title 3",1269,"abtt");
        Book book4=new Book("author4","title 4",1998,"abtzt");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter adapter =new MedianAdapter();

        //When
       int median=adapter.publicationYearMedian(bookSet);

      //Then
        assertEquals(1985,median);


    }
}
