// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

package HW_1;

import java.util.Scanner;

public class task_03 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      int num1 = input.nextInt();
      System.out.print("Введите оператор (+, -, *, /): ");
      char operator = input.next().charAt(0);
      System.out.print("Введите второе число: ");
      int num2 = input.nextInt();
      int result = 0;
      input.close();
      switch(operator) {
         case '+':
            result = num1 + num2;
            break;
         case '-':
            result = num1 - num2;
            break;
         case '*':
            result = num1 * num2;
            break;
         case '/':
            result = num1 / num2;
            break;
         default:
            System.out.println("Ошибка: неверный оператор");
            return;
      }
      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
   }
}