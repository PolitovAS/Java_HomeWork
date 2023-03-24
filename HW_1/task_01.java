// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

package HW_1;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        int[] cubeArray = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            cubeArray[i-1] = i * i * i;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        scanner.close();

        System.out.printf("Куб числа %d равен %d\n", a, cubeArray[a-1]);
        System.out.printf("Куб числа %d равен %d\n", b, cubeArray[b-1]);
    }
}
