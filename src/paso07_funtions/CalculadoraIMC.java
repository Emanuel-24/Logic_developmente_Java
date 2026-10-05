package paso07_funtions;

import java.util.Scanner;

public class CalculadoraIMC {
    static void main(String[] args) {
        System.out.println("*******Bienvenido al calulador IMC*********");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita tu peso: ");
        double weight = scanner.nextDouble();
        System.out.print("Digita tu altura: ");
        double tall = scanner.nextDouble();

        System.out.print(CalIMC(weight, tall));


    }
    public static String CalIMC(double weight, double tall){
        double IMC = weight / (tall * tall);
        String IMCFormatted = String.format("%.2f", IMC);
        return "Tu IMC es de: "+IMCFormatted+" y equivale a "+CategoryIMC(IMC);
    }
    public static String CategoryIMC(double IMC){
        String category = "";
        if (IMC < 18.5) {
            category = "Bajo peso";
        } else if (IMC >= 18.5 && IMC < 25) {
            category = "peso normal";
        }
        else if (IMC >= 25 && IMC < 30) {
            category = "Sobre peso";
        }
        else if (IMC >= 30.00) {
            category = "Obesidad";
        }
        return category;
    }
}
