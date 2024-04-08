package lesson24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    private String name;
    private int id;
    private Set<User> friends = new HashSet<>();
    private ArrayList<Massage> massages;

    public void setFriends(HashSet<User> friends) {
        this.friends = friends;
    }

    public ArrayList<Massage> getMassage() {
        return massages;
    }

    public void setMassage(ArrayList<Massage> massage) {
        this.massages = massage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<User> getFriends() {
        return (HashSet<User>) friends;
    }


    public User(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public boolean friendsAdd(User user) {
        if (this.id == user.id) {
            return false;
        } else {
            this.friends.add(user);
            return true;
        }
    }

    public boolean friendsRemote(User user) {
        if (user != null) {
            friends.remove(user);
            return true;
        } else {
            return false;
        }
    }
    public boolean addMassage(Massage massage){
        massages.add(massage);
        return true;
    }
}
