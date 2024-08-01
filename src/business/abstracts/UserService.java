package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void register(User user);
    void login(User user,String mail,String password);
    void registerWithGoogleService(User user);

}
