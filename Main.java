import models.users.User;
import models.users.Admin;
import models.library.Book;
import models.library.Category;
import models.library.Download;
import util.ObjectFactory;

public class Main {
    public static void main(String[] args) {
        User user = ObjectFactory.createUser("Іван", "Петренко");
        Admin admin = ObjectFactory.createAdmin("Олена");
        Book book = ObjectFactory.createBook("Кобзар");
        Category category = ObjectFactory.createCategory("Класична література");
        Download download = ObjectFactory.createDownload(user, book, "2025-10-03");

        user.printInfo();
        admin.printInfo();
        book.printInfo();
        category.printInfo();
        download.printInfo();

        System.out.println("Created entities: " + models.base.Entity.getCreatedCount());
    }
}
