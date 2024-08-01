package googleAuth;

import entities.concretes.User;

public class GoogleAuth {
    public void registerWithGoogle(User user){
        System.out.println(user.getEmail()+ " registered by google");
    }
}
