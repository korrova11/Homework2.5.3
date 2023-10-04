package service;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class AccountService {
    public static void checkAccount(String login, String password, String confirmPassword) {

        if (login != null && password != null && confirmPassword != null) {
            if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongLoginException();
            }
            if (!(password.matches("^[a-zA-Z0-9_]{1,20}$") && (confirmPassword.matches("^[a-zA-Z0-9_]{1,20}$")) &&
                    (password.equals(confirmPassword)))) {
                throw new WrongPasswordException();
            }


        }

    }
}
