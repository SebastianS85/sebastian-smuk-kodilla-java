package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {


    @Test
    public void testGetBooks() {
        //given
        Library firstLibrary = new Library("My First Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> firstLibrary.getBooks().add(new Book("Title" + n, "author" + n, LocalDate.of(1985, 10, 20))));


        Library clonedLibrary = null;
        try {
            clonedLibrary = firstLibrary.shallowCopy();
            clonedLibrary.setName("Copy of Library");


        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = firstLibrary.deepCopy();
            deepClonedLibrary.setName("deepCloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When

        firstLibrary.getBooks().remove(new Book("Title8", "author8", LocalDate.of(1985, 10, 20)));

        //Then
        System.out.println(firstLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(9, firstLibrary.getBooks().size());
        Assert.assertEquals(9, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());

    }


}
