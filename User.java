package models.users;

import models.base.Entity;

public class User extends Entity {
    protected String name;
    protected String surname;
    protected String login;
    protected String password;
    protected String role;

    public User(int id, String name, String surname, String login, String password, String role) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public void printInfo() {
        System.out.println("User: " + name + " " + surname);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", " + name + ", " + surname + "}";
    }
}
