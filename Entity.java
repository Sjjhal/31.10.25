package models.base;

public abstract class Entity {
    protected int id;
    private static int counter = 1;

    public Entity() {
        this.id = counter++;
    }

    public Entity(int id) {
        this.id = id;
    }

    public static int getCreatedCount() {
        return counter - 1;
    }

    public int getId() {
        return id;
    }

    public abstract void printInfo();
}
