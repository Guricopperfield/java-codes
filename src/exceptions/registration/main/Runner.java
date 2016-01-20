
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
            try {
                validateSurname(surname);
            }
            catch(IllegalSurnameException ex) {
                mainex.add(ex);
            }
            try {
                validateID(ID);
            }
            catch(IllegalIDException ex) {
                mainex.add(ex);
            }
            try {
                validateYear(year, month, date);
            }
            catch(IllegalDateException ex) {
                mainex.add(ex);
            }
            try {
                validateNumber(number);
            }
            catch(IllegalNumberException ex) {
                mainex.add(ex);
            }
    }
    public static void validateName(String name) throws IllegalNameException {
        if(name.length() <= 1) {
            throw new IllegalNameException("Illegal name");
        }
    }
	public static void validateSurname(String surname) throws IllegalSurnameException {
        if(surname.length() <= 1) {
            throw new IllegalSurnameException("Illegal surname");
        }
    }
    public static void validateID(String ID) throws IllegalIDException {
        if(ID.length() != 11 || !ID.matches("[0-9]+")) {
            throw new IllegalIDException("Illegal iD");
        }
    }
    public static void validateYear(int year, int month, int date ) throws IllegalDateException { // use Date class for year
        if(month <= 0 || month >= 11) {
            if(date <= 0 || date >= 30) throw new IllegalDateException("Illegal Date");
        }
    public static void validateNumber(String number) {
        if(!number.matches("[0-9]+")) throw new IllegalNumberException("Illegal Number");
       }

    }
}
