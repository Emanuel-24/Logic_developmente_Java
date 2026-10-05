package paso06_aritmetics_operators;

import java.util.Scanner;

public class AreaRectangulo {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********Bienvenido al calculador de área de un rectángulo**********");
        System.out.print("Digita la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digita la altura del triangulo: ");
        double tall = scanner.nextDouble();

        System.out.print("El area del rectángulo es: " + (base * tall));
    }
}

