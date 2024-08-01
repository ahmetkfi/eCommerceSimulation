import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleAuthAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import utils.concretes.ValidateManager;

public class App {
    public static void main(String[] args) throws Exception {
       UserService userService=new UserManager(new HibernateUserDao(),new ValidateManager(),new GoogleAuthAdapter());

        User user=new User(1,"Ahmet","Koçyiğit","ahmet123@gmail.com","1456978");

        userService.register(user);
        userService.registerWithGoogleService(user);

        userService.login(user,"ahmet123@gmail.com","14569278");
    }
}
