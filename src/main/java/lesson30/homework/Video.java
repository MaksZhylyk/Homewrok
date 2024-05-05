package lesson30.homework;

public class Video extends Content implements Interactable{
    private int duration;
    private int views;
    private int likes;
    private int dislikes;

    public Video(int id, String title, int duration, int views, int likes, int dislikes) {
        super(id, title);
        this.duration = duration;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
    }
    public void like(){
        likes++;
    }
    public void dislike(){
        dislikes++;
    }
    public void watch(){
        views++;
    }
    public void displayInfo(){
        System.out.println("Video ID:" + id);
        System.out.println("Title:" + title);
        System.out.println("Duration:" + duration + "minutes");
        System.out.println("Views:" + views);
        System.out.println("Likes:" + likes);
        System.out.println("Dislikes:" + dislikes);
    }
}
