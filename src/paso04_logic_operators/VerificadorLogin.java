package paso04_logic_operators;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class VerificadorLogin {
    static void main(String[] args) {
        String userR = "admin";
        String passwordR = "IAS123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bievenido al inicio de sesion");
        System.out.print("Digite su usuario:");
        String user = scanner.nextLine();
        System.out.print("Digite su contraseña:");
        String password = scanner.nextLine();

        if (user.equals(userR) && password.equals(passwordR)){
            System.out.println("Datos correctos, bienvenido.");
        } else {
            System.out.println("Datos incorrectos.");
        }


    }
}
