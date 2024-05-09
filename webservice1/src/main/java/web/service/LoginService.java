package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {
		// Match a fixed user name and password.
		//
		if ("Jahanzaib".equals(username) && "Khan".equals(password) && "1996-11-09".equals(dob)) {
			return true;
		}
		return false;
	}
	
	
}
