package lesson43.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationManager {
    private Map<String, User> users = new HashMap<>();

    public AuthenticationManager(String userFilePath) throws IOException{
        loadUsers(userFilePath);
    }

    private void loadUsers(String filePath) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while((line = reader.readLine()) != null){
            String[] parts = line.split(",");
            if(parts.length == 3){
                users.put(parts[0], new User(parts[0].trim(), parts[1].trim(), parts[2].trim()));
            }
        }
    reader.close();
    }

    public User authentication(String username, String password){
        User user = users.get(username);
        if(user != null && user.getPassword().equals(password)){
            return user;

        }
        return null;
    }

}
