package web.service;

import org.junit.Assert;
import org.junit.Test;

public class LoginServiceTestUnitCase {

	
	@Test
    public void testValidLogin() {
        // Arrange
        String username = "Jahanzaib";
        String password = "Khan";
        String dob = "1996-11-09";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void testInvalidUsername() {
        // Arrange
        String username = "Jahan";
        String password = "Khan";
        String dob = "1996-11-09";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidPassword() {
        // Arrange
        String username = "Jahanzaib";
        String password = "Kha";
        String dob = "1996-11-09";

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testInvalidDOB() {
        // Arrange
        String username = "Jahanzaib";
        String password = "Khan";
        String dob = "1995-11-10"; // Invalid date format

        // Act
        boolean result = LoginService.login(username, password, dob);

        // Assert
        Assert.assertFalse(result);
    }
	
}
