package models.library;

import models.base.Entity;

public class Category extends Entity {
    protected String name;

    public Category(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("Category: " + name);
    }

    @Override
    public String toString() {
        return "Category{id=" + id + ", " + name + "}";
    }
}
