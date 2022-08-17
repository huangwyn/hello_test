package hello_test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PasswordRegex{
	public static boolean check(String password) {
		String regexTemplate = "^(?=.*[0-9])" 	// require digit
				+ "(?=.*[a-z])(?=.*[A-Z])" 		// require lower and capitals
				+ "(?=.*[@#$%^&-+=()])" 		// require special characters
				+ "(?=\\S+$)"					// eliminate whitespace
				+ ".{8,20}$";					// character limit of 8-20
		
		// compile
		Pattern p = Pattern.compile(regexTemplate);
		
		// empty check
		if (password == null) {
			return false;
		}
		
		return p.matcher(password).matches();
	}
}
