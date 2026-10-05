package paso05_Tipos_de_Datos;

import java.util.Scanner;

public class PerfilUsuario {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******Bienvenido a Crear perfil*******");
        System.out.print("Empecemos por tu nombre completo:");
        String name = scanner.nextLine();
        System.out.print("Cuál es tu edad? ");
        int age = scanner.nextInt();
        System.out.print("Cuál es tu estatura? ej: '1,70' ");
        double tall = scanner.nextDouble();
        System.out.print("Eres empleado?('true' o 'false') ");
        boolean employed = scanner.nextBoolean();
        System.out.print("Cuál es tu genero? (M/F) ");
        char genero = scanner.next().charAt(0);

        System.out.println("Listo, haz creado tu usuario correctamtente");
        System.out.println("***********Perfil***********");

        System.out.println("Nombre completo: " + name);
        System.out.println("Edad: " + age + " años");
        System.out.printf("Altura: %.2f Mts%n",tall);
        System.out.println("Empleado: " + employed);
        System.out.println("Genero: " + genero);
    }
}
