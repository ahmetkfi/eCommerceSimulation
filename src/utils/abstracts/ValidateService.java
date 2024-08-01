package utils.abstracts;

public interface ValidateService {
    boolean validateEmail(String email);
    boolean emailAlreadyExists(String email);
    void sendValidationEmail(String email);
    void onValidateEmail(String email);
}
