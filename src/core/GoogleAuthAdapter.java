package core;

import entities.concretes.User;
import googleAuth.GoogleAuth;

public class GoogleAuthAdapter implements UserAuthService{
    @Override
    public void auth(User user) {
        GoogleAuth googleAuth = new GoogleAuth();
        googleAuth.registerWithGoogle(user);
    }
}
