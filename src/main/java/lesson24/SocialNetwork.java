package lesson24;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class SocialNetwork {
    public static void main(String[] args) {
        User user1 = new User("John Snow", 1);
        User user2 = new User("Patricia Woolf", 2);
        User user3 = new User("Sean Black", 3);
        User user4 = new User("Karl Invoker", 4);
        user2.friendsAdd(user1);
        user4.friendsAdd(user1);
        user4.friendsAdd(user2);
        user4.friendsAdd(user3);
        user4.friendsAdd(user4);
        System.out.println(user2);
        System.out.println(user4.getFriends());
        Massage massage1 = new Massage(user1, "Will play today?", LocalDateTime.now());
        Massage massage2 = new Massage(user2, "Will play tomorrow?", LocalDateTime.now());
        Massage massage3 = new Massage(user3, "Will study tomorrow?", LocalDateTime.now());
        Massage massage4 = new Massage(user4, "Have you date with Patricia evening?", LocalDateTime.now());
        massage1.likeAdd(user3);
        System.out.println(massage1);
        Community community1 = new Community("Work");
        HashMap<String, Community> hashMap = new HashMap<>();
        hashMap.put(community1.getCommunityName(), community1);
        community1.userAddToCommunity(user1);
        community1.userAddToCommunity(user3);
        community1.userAddToCommunity(user4);
        System.out.println(hashMap);




    }
}
