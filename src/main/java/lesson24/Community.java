package lesson24;

import java.util.HashSet;
import java.util.Set;

public class Community {
    private String communityName;
    private Set<User> communityUsers = new HashSet<>();

    @Override
    public String toString() {
        return "Community{" +
                "communityName='" + communityName + '\'' +
                ", communityUsers=" + communityUsers +
                '}';
    }

    public Community(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public Set<User> getCommunityUsers() {
        return communityUsers;
    }

    public void setCommunityUsers(HashSet<User> communityUsers) {
        this.communityUsers = communityUsers;
    }

    public boolean userAddToCommunity(User user){
        if(user == null){
            return false;
        } else {
            communityUsers.add(user);
            return true;
        }
    }
}
