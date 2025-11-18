package storage;

import models.users.User;
import models.users.Admin;
import models.library.Book;
import models.library.Category;
import models.library.Download;

public class AppStorage {
    public static User[] users = new User[100];
    public static Book[] books = new Book[100];
    public static Category[] categories = new Category[100];
    public static Download[] downloads = new Download[100];
    public static Admin[] admins = new Admin[100];

    public static int userCount = 0;
    public static int bookCount = 0;
    public static int categoryCount = 0;
    public static int downloadCount = 0;
    public static int adminCount = 0;
}
