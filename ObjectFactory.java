package util;

import models.users.User;
import models.users.Admin;
import models.library.Book;
import models.library.Category;
import models.library.Download;
import storage.AppStorage;

public class ObjectFactory {

    public static User createUser(String name, String surname) {
        User u = new User(1, name, surname, name + "123", "pass", "користувач");
        AppStorage.users[AppStorage.userCount++] = u;
        return u;
    }

    public static Admin createAdmin(String name) {
        Admin a = new Admin(1, name);
        AppStorage.admins[AppStorage.adminCount++] = a;
        return a;
    }

    public static Book createBook(String title) {
        Book b = new Book(1, title, "Автор", 2000, "Жанр", "формат");
        AppStorage.books[AppStorage.bookCount++] = b;
        return b;
    }

    public static Category createCategory(String name) {
        Category c = new Category(1, name);
        AppStorage.categories[AppStorage.categoryCount++] = c;
        return c;
    }

    public static Download createDownload(User u, Book b, String date) {
        Download d = new Download(1, u, b, date);
        AppStorage.downloads[AppStorage.downloadCount++] = d;
        return d;
    }
}
