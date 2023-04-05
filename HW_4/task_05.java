// Task_5
// Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

package HW_4;

import java.util.*;

public class task_05 {
    public static void main(String[] args) {
        System.out.println("()[] - " + validate("()[]"));
        System.out.println("() - " + validate("()"));
        System.out.println("{[()]} - " + validate("{[()]}"));
        System.out.println("()() - " + validate("()()"));
        System.out.println(")()( - " + validate(")()("));
    }
    public static boolean validate(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                deque.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (deque.isEmpty()) {
                    return false;
                }
                char last_char = deque.pop();
                if ((c == ')' && last_char != '(') ||
                    (c == ']' && last_char != '[') ||
                    (c == '}' && last_char != '{')) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}