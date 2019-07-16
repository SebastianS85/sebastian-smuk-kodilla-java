package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    @Override
    public String toString() {
        return "Library" +
                " name=" + name + '\n' +
                "Books in library:" + '\n' + books + '\n';
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();

        for (Book bookLibrary : books) {
            Book clonedBookList = new Book(bookLibrary.getAuthor(), bookLibrary.getTitle(), bookLibrary.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBookList);

        }
        return clonedLibrary;
    }
}
