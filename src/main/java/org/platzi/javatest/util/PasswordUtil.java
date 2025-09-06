package org.platzi.javatest.util;

public class PasswordUtil {

    public enum securityLeve {
        WEAK, MEDIUM, STRONG
    }

    public static securityLeve assesPassword(String password){
        if (password.length() < 8){
            return securityLeve.WEAK;
        }
        if (password.matches("[a-zA-Z]+")){
            return securityLeve.MEDIUM;
        }

        if (password.matches("[a-zA-Z0-9]+")){
            return securityLeve.MEDIUM;
        }

        return securityLeve.STRONG;
    }

}
