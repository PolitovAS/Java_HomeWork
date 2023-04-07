// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package HW_5;

import java.util.*;

public class task_01 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Количество строк: ");
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Имя: ");
            String name = sc.nextLine();
            System.out.printf("Номер: ");
            int number = sc.nextInt();
            sc.nextLine();
            addNumber(name, number, bookPhone);
        }
        printBook(bookPhone);
    }

       public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones.substring(0, phones.length() - 2));
        }
    }
}
