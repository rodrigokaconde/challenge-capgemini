package com.rfoliveira.secureString;

public class CheckPasswordLength {
    static int checkPassword(String password) {
        if (password.length() < 6)
            return 6 - password.length();
        return 0;
    }
}