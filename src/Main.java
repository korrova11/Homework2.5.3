import exception.WrongLoginException;
import exception.WrongPasswordException;

import static service.AccountService.checkAccount;

public class Main {
    public static void main(String[] args) {
        try {
            checkAccount("gjgjgj", "fhjdldh", "fhjdld");
        } catch (WrongLoginException e) {
            System.out.println("Неправильный логин");

        } catch (WrongPasswordException e) {
            System.out.println("Неправильный пароль");
        }

    }
}