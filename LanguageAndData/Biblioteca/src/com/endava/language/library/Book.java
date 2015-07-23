/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

package com.endava.language.library;

public class Book implements Comparable {

    private String title;
    private String author;
    private String publisher;
    private int numberOfPages;

    public Book(String title, String author, String publisher, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    //Compares the number of pages and returns the thicker book
    public static Book comparePages(Book c1, Book c2) {
        if (c1.getNumberOfPages() > c2.getNumberOfPages()) {
            return c1;
        } else {
            return c2;
        }
    }

    @Override
    public int compareTo(Object o) {
        Book c = (Book) o;

        if (c.getAuthor().equals(author) && c.getTitle().equals(title)) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return title + ", " + author + ", " + publisher;
    }
}
