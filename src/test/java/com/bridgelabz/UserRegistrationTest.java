package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.firstName("Abcd");
        Assertions.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.lastName("Abcd");
        Assertions.assertTrue(result);
    }
    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.emailValidation("abc..@radif.com");
        Assertions.assertFalse(result);
    }
}