package lesson30.homework;

public class Comment extends Content{
private String author;
private String comment;

    public Comment(int id, String title, String author, String comment) {
        super(id, title);
        this.author = author;
        this.comment = comment;
    }
    public void displayInfo(){
        System.out.println("Comment ID:" + id);
        System.out.println("Author:" + author);
        System.out.println("Comment:" + comment);
    }
}
