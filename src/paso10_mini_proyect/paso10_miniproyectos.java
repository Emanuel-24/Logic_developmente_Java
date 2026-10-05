package paso10_mini_proyect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class paso10_miniproyectos {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var students = new HashMap<String, ArrayList<Double>>();

        boolean exit = true;
        System.out.printf("*******Bienvenido al Calculador de notas*******%n%n");
        while(exit){

            System.out.println("Menú:");

            System.out.println("1. Registrar estudiante.");
            System.out.println("2. Calcular desempeño estudiantes.");
            System.out.println("3. Calcular promedio general del grupo.");
            System.out.println("4. Calcular promedio más alto y bajo del grupo.");
            System.out.println("5. Salir.");

            System.out.print("Selecciona una opción por número: ");
            var option = scanner.nextInt();

            switch (option){
                case 1:
                    RegisterStudent(students);
                    break;
                case 2:
                    CalcPerformanceStudent(students);
                    break;
                case 3:
                    PromGroup(students);
                    break;
                case 4:
                    CalcMaxAndMinProm(students);
                    break;
                case 5:
                    exit = false;
                    System.out.println("Sistema cerrado correctamente, hasta pronto!");
                    break;
                default:
                    System.err.printf("Error con la opción digitada. Intenta de nuevo. %n%n");
                    break;
            }
        }
    }
    public static void RegisterStudent(HashMap<String,ArrayList<Double>> students){
        Scanner scanner = new Scanner(System.in);
        var notes = new ArrayList<Double>();

        System.out.print("Digita el nombre del estudiante: ");
        String name = scanner.nextLine().trim();
        System.out.println(); // espacio para dar orden

        System.out.println("Digita las 5 notas del estudiante:");
        for (int i = 1; i <= 5; i++){
            System.out.printf("Nota %d: ",i);
            double note = scanner.nextDouble();
            notes.add(note);
        }
        System.out.println("Lista de notas: " + notes);
        System.out.printf("Estudiante registrado correctamente.%n%n");
        students.put(name,notes);

    }
    public static void CalcPerformanceStudent(HashMap<String, ArrayList<Double>> students){
        if (students.isEmpty()){
            System.out.println("Deben haber al menos 1 estudiante registrado.");
            return;
        }

        for (var entry : students.entrySet()){
            ArrayList<Double> notes = entry.getValue();
            double prom = PromStudent(notes);

            if (prom >= 3.0){
                System.out.printf("Estudiante %s: Aprobado | Promedio: %.2f%n",entry.getKey(), prom);
            } else {
                System.out.printf("Estudiante %s: Reprobado | Promedio: %.2f%n",entry.getKey(), prom);
            }
        }
        System.out.println(); // Salto de línea para orden
    }
    public static double PromStudent(ArrayList<Double> notes){
        if (notes == null || notes.isEmpty()){
            return 0.0;
        } else {
            double note = 0;

            for (int i = 0; i < notes.size(); i++){
                note += notes.get(i);
            }
            return note / notes.size();
        }
    }
    public static void PromGroup(HashMap<String, ArrayList<Double>> students){
        if (students.size() < 2){
            System.out.println("Deben haber al menos 2 estudiantes registrados.");
            return;
        }
        double groupNotes = 0;

        for (var entry : students.entrySet()) {
            ArrayList<Double> notes = entry.getValue();
            groupNotes += PromStudent(notes);
        }
        double result = groupNotes / students.size();
        System.out.printf("Promedio general del grupo: %.2f%n%n",result);
    }
    public static void CalcMaxAndMinProm(HashMap<String, ArrayList<Double>> students){
        if (students.size() < 2){
            System.out.println("Deben haber al menos 2 estudiantes registrados.");
            return;
        }

        double max = 0;
        double min = Double.MAX_VALUE;
        String nameMax = "";
        String nameMin = "";
        for (var entry : students.entrySet()) {
            ArrayList<Double> notes = entry.getValue();
            double prom = PromStudent(notes);

            // Max
            if (prom > max){
                max = prom;
                nameMax = entry.getKey();
            }
            // Min
            if (prom < min){
                min = prom;
                nameMin = entry.getKey();
            }
        }
        System.out.printf("El mejor promedio lo tiene: %s con %.2f%n",nameMax,max);
        System.out.printf("El promedio más bajo lo tiene: %s con %.2f%n%n",nameMin,min);
    }
}
