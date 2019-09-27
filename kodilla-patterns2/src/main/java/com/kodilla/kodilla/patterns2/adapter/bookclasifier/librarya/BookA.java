package com.kodilla.kodilla.patterns2.adapter.bookclasifier.librarya;

public class BookA {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final String siganture;

    public BookA(String author, String title, int publicationYear, String siganture) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.siganture = siganture;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSiganture() {
        return siganture;
    }
}