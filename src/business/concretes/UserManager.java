package business.concretes;

import business.abstracts.UserService;
import core.UserAuthService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import utils.abstracts.ValidateService;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;
    private ValidateService validateService;
    private UserAuthService userAuthService;
    public UserManager(UserDao userDao,ValidateService validateService,UserAuthService userAuthService) {
        this.userDao = userDao;
        this.validateService = validateService;
        this.userAuthService = userAuthService;
    }
    @Override
    public void register(User user) {
        if(user.getPassword().length()>=6 && this.validateService.validateEmail(user.getEmail()) && !(validateService.emailAlreadyExists(user.getEmail()))){
                this.userDao.createUser(user);
                this.validateService.sendValidationEmail(user.getEmail());
                this.validateService.onValidateEmail(user.getEmail());
        }else{
            System.out.println("Invalid email or password");
        }
    }

    @Override
    public void login(User user,String mail,String password) {
            if(user.getPassword().equals(password) && user.getEmail().equals(mail)){
                System.out.println(user.getEmail() + " Login succesfull ");
            }else{
                System.out.println("Invalid email or password");
            }
    }

    @Override
    public void registerWithGoogleService(User user) {
        userAuthService.auth(user);
    }

}
