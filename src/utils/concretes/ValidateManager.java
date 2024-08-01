package utils.concretes;

import utils.abstracts.ValidateService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateManager implements ValidateService {
    String[] usedEmails={
        "ahmetkcygt58@gmail.com",
        "elfisuokumus@gmail.com",
    };
    private String regexValidation="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    @Override
    public boolean validateEmail(String email) {
        if(email==null || email.isEmpty()){
            return false;
        }
        Pattern pattern = Pattern.compile(regexValidation);
        if(pattern.matcher(email).matches()){
            return true;
        }
        return false;
    }
    public boolean emailAlreadyExists(String email) {

        for(String emails: usedEmails){
            if(email.equals(emails)){
                return true;
            }
        }
        return false;
    }
    public void sendValidationEmail(String email) {
        System.out.println(email + " adreine aktivasyon linki gönderildi");
    }
    public void onValidateEmail(String email) {
        System.out.println(email + " email adresiniz onaylandı");
    }
}
