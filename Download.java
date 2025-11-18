package models.library;

import models.base.Entity;
import models.users.User;

public class Download extends Entity {
    protected User user;
    protected Book book;
    protected String date;

    public Download(int id, User user, Book book, String date) {
        super(id);
        this.user = user;
        this.book = book;
        this.date = date;
    }

    @Override
    public void printInfo() {
        System.out.println("Download: " + user.getId() + " -> " + book.getId());
    }

    @Override
    public String toString() {
        return "Download{id=" + id + ", user=" + user.getId() + ", book=" + book.getId() + "}";
    }
}
