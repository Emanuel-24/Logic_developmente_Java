package paso08_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    static void main(String[] args) {
        System.out.printf("Bienvenido, %naquí podrás añadir los productos que quieres comprar.%nCuando quieras dejar de agregar productos sólo escribe 'fin'.%n%n");

        FormattedList(AddList());


    }
    public static ArrayList<String> AddList(){
        String entrada = "";
        Scanner scanner = new Scanner(System.in);
        var list = new ArrayList<String>();

        while(true){
            System.out.print("Digita el nombre del producto: ");
            entrada = scanner.nextLine().trim();
            
            if (entrada.equalsIgnoreCase("fin")){
                break;
            } else if (!entrada.isEmpty()) {
                list.add(entrada);
            }

        }
        return list;
    }

    public static void FormattedList(ArrayList<String> list){
        System.out.println("*******Lista de productos*******");
        int i = 0;
        for (var products : list){
            i++;
            System.out.printf("%d.Producto: %s%n",i,products);
        }
    }
}
