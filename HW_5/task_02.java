// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package HW_5;
import java.util.*;
public class task_02 {   
    public static void main(String[] args) {
        String[] employees = new String[] {
            "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", 
            "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
            "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
            "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
            "Петр Петин", "Иван Ежов"
        };

        Map<String, Integer> nameCount = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCount.entrySet());
        Collections.sort(sortedEntries, Map.Entry.<String, Integer>comparingByValue().reversed());

        System.out.println("Повторяющиеся имена, отсортированные по убыванию популярности: ");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
            }
        }
    }
}