package paso09_Algoritms;

import java.util.Arrays;

public class OrdenamientoBurbuja {
    static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length -1 -i; j++){
                if (numbers[j] > numbers[j + 1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
