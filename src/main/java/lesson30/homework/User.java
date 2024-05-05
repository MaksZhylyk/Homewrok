package lesson30.homework;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private List<Content> uploadedContent;

    public User(int id, String username, List<Content> uploadedContent) {
        this.id = id;
        this.username = username;
        this.uploadedContent = new ArrayList<>(uploadedContent);
    }

    public void uploadedContent(Content content){
        uploadedContent.add(content);
    }
    public void deleteContent(Content content){
        uploadedContent.remove(content);
    }
    public void displayUploadedContent(){
        System.out.println("Uploaded content by User" + username);
        for(Content content: uploadedContent){
            content.displayInfo();
        }
    }
}
