// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// Пример: s = “cba”, index = [3,2,1] result “abc”

package HW_2;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("s = ");
        String s = iScanner.nextLine();
        int[] index = new int[s.length()];
        iScanner.close();
        for (int i = index.length - 1; i >= 0; i--) {
            index[i] = index.length - i; 
        }
        String result = restoreString(s, index);
        System.out.println(result);
    }
    
    public static String restoreString(String s, int[] index) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffled[index[i] - 1] = s.charAt(i);
        }
        return new String(shuffled);
    }
}
