package models.library;

import models.base.Entity;

public class Book extends Entity {
    protected String title;
    protected String author;
    protected int year;
    protected String genre;
    protected String format;

    public Book(int id, String title, String author, int year, String genre, String format) {
        super(id);
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.format = format;
    }

    @Override
    public void printInfo() {
        System.out.println("Book: " + title);
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", " + title + "}";
    }
}
