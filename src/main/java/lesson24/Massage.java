package lesson24;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Massage {
    private User user;
    private String massage;
    private LocalDateTime time;
    private Set<User> like = new HashSet<>();

    public Massage(User user, String massage, LocalDateTime time) {
        this.user = user;
        this.massage = massage;
        this.time = time;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Set<User> getLike() {
        return like;
    }

    public void setLike(HashSet<User> like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "user=" + user +
                ", massage='" + massage + '\'' +
                ", time=" + time +
                ", like=" + like +
                '}';
    }
   public boolean likeAdd(User user){
        if(user != null){
            like.add(user);
            return true;
        } else{
            return false;
        }
    }
}
