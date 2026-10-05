package paso02_PseudoCodigo;

import java.util.Scanner;

public class PromedioCincoNumeros {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Digita un número: ");
            double entrada = scanner.nextDouble();

            total += entrada;
        }
        System.out.printf("Promedio: %.2f%n", (total / 5));
    }
}
