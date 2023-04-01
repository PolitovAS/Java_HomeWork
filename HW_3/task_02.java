// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package HW_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size = input.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d элемент: ", i+1);
            list.add(input.nextInt());
        }
        input.close();
        System.out.println("Исходный список: " + list);
        List<Integer> newList = removeEvenValue(list);
        System.out.println("Список после удаления чётных чисел: " + newList);
    }

    public static List<Integer> removeEvenValue(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for (Integer num : list){
            if (num % 2 != 0){
                newList.add(num);
            }
        }
        return newList;
    }
}
