package models.users;

public class Admin extends User {
    public Admin(int id, String name) {
        super(id, name, "Адмін", "admin", "admin", "адмін");
    }

    @Override
    public void printInfo() {
        System.out.println("Admin: " + name);
    }

    @Override
    public String toString() {
        return "Admin{id=" + id + ", " + name + "}";
    }
}
