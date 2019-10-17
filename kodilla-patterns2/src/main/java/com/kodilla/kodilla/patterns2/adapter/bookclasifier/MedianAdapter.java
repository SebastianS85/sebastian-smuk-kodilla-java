package com.kodilla.kodilla.patterns2.adapter.bookclasifier;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

        if (bookSet.size() == 0) {
            return 0;
        }
        Map<BookSignature, com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();

        for (Book book : bookSet) {
            books.put(new BookSignature(book.getSiganture()), new com.kodilla.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));

        }

        return medianPublicationYear(books);
    }

}

