// На первой строке записывается натуральное число n - количество строчек в книге.
// Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов,
// на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2",
// где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1.
// Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами.
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
// На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы,
// то и замена тоже должна начинаться с большой буквы!

// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измельчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:
// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измельчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

package HW_2;
import java.util.*;
public class task_02 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        System.out.printf("Количество строк в книге: ");
        int n = scanner.nextInt();
        scanner.nextLine();
       
        List<String> book = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Рецепт %d: \n", i+1);
            book.add(scanner.nextLine());
        }

        System.out.printf("Количество замен: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите замену используя формат: \"Старое значение\" - \"Новое значение\"");
        Map<String, String> replacements = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" - ");
            replacements.put(parts[0], parts[1]);
        }

        for (String line : book) {
            for (String product : replacements.keySet()) {
                String replacement = replacements.get(product);
                line = line.replaceAll("\\b" + product + "\\b", replacement);
                line = line.replaceAll("\\b" + capitalize(product) + "\\b", capitalize(replacement));
            }
            System.out.println(line);
        }
        scanner.close();
    }

    // Вспомогательная функция для приведения первой буквы слова к верхнему регистру
    private static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}