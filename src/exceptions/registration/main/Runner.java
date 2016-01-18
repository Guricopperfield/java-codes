
package registration.main;
import registration.enums.*;
import registration.exceptions.*;
public class Runner {
    public static void main(String[] args) {
        
    }
    public static void register(String name, String surname, String ID, String email, int year,
            int month, int date, String number, Gender gender, String username, String password) throws MainException {
        
            MainException mainex = new MainException();
            try {
                validateName(name);
            }
            catch(IllegalNameException ex) {
                mainex.add(ex);
            }
    }
    public static void validateName(String name) throws IllegalNameException {
        if(name.length() <= 1) {
            throw new IllegalNameException("Illegal name");
        }
    }
}
