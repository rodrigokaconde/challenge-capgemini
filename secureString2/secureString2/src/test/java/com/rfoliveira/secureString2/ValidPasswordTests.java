package com.rfoliveira.secureString2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPasswordTests {
    String error = "Your password must contain:\n";
    String errorSize = "6 characters or more.\n";
    String errorUppercase = "1 uppercase letter.\n";
    String errorLowercase = "1 lowercase letter.\n";
    String errorNumber = "1 number.\n";
    String errorSpecialCharacter = "1 special character !@#$%^&*()-+.\n";
    String ok = "Strong password";

    @Test
    public void checkPasswordValid(){
        String returPassword = ValidPassword.validPassword("Aaaaa123!@");
        assertEquals(ok, returPassword);
    }

    @Test
    public void checkPasswordErrorSize(){
        String returPassword = ValidPassword.validPassword("Aa1!");
        assertEquals(error+errorSize, returPassword);
    }

    @Test
    public void checkPasswordErrorNumer(){
        String returPassword = ValidPassword.validPassword("Aaaaaaa!!!");
        assertEquals(error+errorNumber, returPassword);
    }

    @Test
    public void checkPasswordErrorLowercase(){
        String returPassword = ValidPassword.validPassword("AAAAA123!!!");
        assertEquals(error+errorLowercase, returPassword);
    }

    @Test
    public void checkPasswordErrorUppercase(){
        String returPassword = ValidPassword.validPassword("aaaaa123!!!");
        assertEquals(error+errorUppercase, returPassword);
    }


    @Test
    public void checkPasswordErrorSpecialCharacter(){
        String returPassword = ValidPassword.validPassword("AAAaaaaa123");
        assertEquals(error+errorSpecialCharacter, returPassword);
    }

    @Test
    public void checkPasswordErrorSizeNumerUppercaseSpecialCharacter(){
        String returPassword = ValidPassword.validPassword("a");
        assertEquals(error+errorSize+errorUppercase+errorNumber+errorSpecialCharacter, returPassword);
    }

    @Test
    public void checkPasswordErrorSizeNumerLowercaseSpecialCharacter(){
        String returPassword = ValidPassword.validPassword("A");
        assertEquals(error+errorSize+errorLowercase+errorNumber+errorSpecialCharacter, returPassword);
    }

    @Test
    public void checkPasswordErrorSizeUppercaseLowercaseSpecialCharacter(){
        String returPassword = ValidPassword.validPassword("1");
        assertEquals(error+errorSize+errorUppercase+errorLowercase+errorSpecialCharacter, returPassword);    }

}
