// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа.
// Выведите на экран результат умножения построчно.
// Sample Input:
// 4

// 1
// 2
// 3
// 5

// 2
// Sample Output:
// 2
// 4
// 6
// 10

package HW_1;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = in.nextInt();        
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("Введите " + i + " элемент: ");
            numbers[i] = in.nextInt();
        }
        System.out.printf("Введите k: ");
        int k = in.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] * k);            
        }
        in.close();
    }

    
}
