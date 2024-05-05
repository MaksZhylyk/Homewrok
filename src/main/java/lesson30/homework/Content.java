package lesson30.homework;

abstract class Content {
    protected int id;
    protected String title;

    public Content(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public abstract void displayInfo();

}
