package repositories;



import user.User;

import java.util.ArrayList;

public class UsersRepo {
    public static ArrayList<User> usersList = new ArrayList<>();
    public static User findByName(String email){
        for(User u : usersList){
            if(u.getEmail().equals(email))
                return u;
        }
        return null;
    }


}
