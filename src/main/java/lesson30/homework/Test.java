package lesson30.homework;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Video video = new Video(1, "Funny animals", 10, 345, 13, 5);
        Video video1 = new Video(2, "Let's study together", 35, 732, 113, 8);
        Comment comment = new Comment(1, "Really funny video", "John", "I can't stop laughing");
        Comment comment1 = new Comment(2, "Nice video", "Harry", "Very informative!");
       List<Content> contentList = new ArrayList<>();
        contentList.add(video1);
       contentList.add(video);
       contentList.add(comment1);
       contentList.add(comment);

        User user = new User(1, "Little Pat", contentList);
        user.displayUploadedContent();
    }
}
