package UserRegistration;

import java.util.regex.Pattern;

public class Library {
	
	public boolean checkValidFirstName(String string) {
		Pattern myPattern = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{2,}");
		return myPattern.matcher(string).matches();
	}
	
    public static void main(String[] args) {
        System.out.println("Welcome here!");
    }
}
