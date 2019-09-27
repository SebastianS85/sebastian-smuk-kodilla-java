package com.kodilla.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {

        if (bookSet.size() == 0) {
            return 0;
        }
        Map<BookSignature, Book> books = new HashMap<>();

        for (BookA book : bookSet) {
            books.put(new BookSignature(book.getSiganture()), new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));

        }

        return medianPublicationYear(books);
    }

}

