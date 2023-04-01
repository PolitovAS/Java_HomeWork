// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package HW_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task_03 {
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
        System.out.println("Минимальное значение: " + getMin(list));
        System.out.println("Максимальное значение: " + getMax(list));
        System.out.println("Среднее значение: " + getAverage(list));
    }
    public static Integer getMin(List<Integer> list){
        Integer min = Integer.MAX_VALUE;
        for (Integer num : list){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    public static Integer getMax(List<Integer> list){
        Integer max = Integer.MIN_VALUE;
        for (Integer num : list){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    public static Double getAverage(List<Integer> list){
        Double sum = 0.0;
        for (Integer num : list){
            sum += num;
        }
        return sum / list.size();
    }
}
