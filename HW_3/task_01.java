// Реализовать алгоритм сортировки слиянием и выборкой.(Самое эффективное , это тзучить эти сортировки на Питоне , и постораться написать их на java)

package HW_3;

import java.util.Arrays;
import java.util.Scanner;

public class task_01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите длину массива: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d элемент: ", i+1);
            arr[i] = input.nextInt();
        }
        System.out.println("Заданный массив: " + Arrays.toString(arr));
        input.close();
        
        int[] sortedArr1 = mergeSort(arr);
        System.out.println("Сортировка слиянием: " + Arrays.toString(sortedArr1));
        
        int[] sortedArr2 = selectionSort(arr);
        System.out.println("Сортировка выборкой: " + Arrays.toString(sortedArr2));
    }
    
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }
    
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            result[k++] = left[i++];
        }
        
        while (j < right.length) {
            result[k++] = right[j++];
        }
        
        return result;
    }
    
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr;
    }
}