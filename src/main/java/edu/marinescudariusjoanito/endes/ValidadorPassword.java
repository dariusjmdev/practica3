package edu.marinescudariusjoanito.endes;

public class ValidadorPassword {
    private static final String regular = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";

    /**
     * Validador de contraseñas en base a la expresion regular
     * @param password contraseña a validar
     * @return true si la contraseña es valida, false si es invalida
     */
    public boolean validar (String password) {

        if (password == null) {
            return false;
        }

        return password.matches(regular);
    }
}
