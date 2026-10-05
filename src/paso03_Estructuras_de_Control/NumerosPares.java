package paso03_Estructuras_de_Control;

public class NumerosPares {
    static void main(String[] args) {
        for (int i = 1; i <= 20; i ++){
            if (i % 2 == 0){
                System.out.println("*"+i+"*");
            }else {
                System.out.println(i);
            }
        }
    }
}
