package com.rfoliveira.secureString2;

public class ValidPassword {
    public static String validPassword(String password) {
        boolean isValid = true;
        String upperCaseChars = "(.*[A-Z].*)";
        String lowerCaseChars = "(.*[a-z].*)";
        String digit = "(.*[0-9].*)";
        String specialChars = "(.*[!,@,#,$,%,^,&,*,(,),-.+].*$)";
        String valid = "Your password must contain:\n";

        if (password.length() < 6) {
            valid += "6 characters or more.\n";
            isValid = false;
        }

        if (!password.matches(upperCaseChars)) {
            valid += "1 uppercase letter.\n";
            isValid = false;
        }

        if (!password.matches(lowerCaseChars)) {
            valid += "1 lowercase letter.\n";
            isValid = false;
        }

        if (!password.matches(digit)) {
            valid += "1 number.\n";
            isValid = false;
        }

        if (!password.matches(specialChars)) {
            valid += "1 special character !@#$%^&*()-+.\n";
            isValid = false;
        }
        if (isValid)
            return "Strong password";
        return valid;
    }
}
