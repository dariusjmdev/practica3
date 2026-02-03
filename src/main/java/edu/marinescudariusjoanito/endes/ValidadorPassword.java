package edu.marinescudariusjoanito.endes;

public class ValidadorPassword {
    private static final String regular = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";

    public boolean validar (String password) {

        if (password == null) {
            return false;
        }

        return password.matches(regular);
    }
}
