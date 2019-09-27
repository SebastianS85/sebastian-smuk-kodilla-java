package com.kodilla.kodilla.patterns2.com.kodilla.patterns2.adapter.company;

import com.kodilla.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void medianTestSuite(){

        Set<BookA> bookSet=new HashSet<>();
        BookA book1=new BookA("author1","title 1",2007,"ab");
        BookA book2=new BookA("author2","title 2",1985,"abcc");
        BookA book3=new BookA("author3","title 3",1496,"abtt");
        BookA book5=new BookA("author3","title 3",1269,"abtt");
        BookA book4=new BookA("author4","title 4",1998,"abtzt");
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
