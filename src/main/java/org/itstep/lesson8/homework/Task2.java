package org.itstep.lesson8.homework;
import java.util.Scanner;
public class Task2 {
    //Завдання 4:
    //kористувач вводить з клавіатури рядок. Перевірте, чи є введений
    //рядок паліндромом. Паліндроми — слова, речення або текст, які
    //однаково читаються як зліва направо, так і справа наліво.
    //Наприклад: кок; козак з казок; радар; а мене нема.



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть рядок: ");
            String inputString = scanner.nextLine();

            String originalString = inputString.replaceAll("\\s", "").toLowerCase();

            // Перевертаємо рядок
            String reversedString = new StringBuilder(originalString).reverse().toString();

            // Перевіряємо, чи є рядок паліндромом
            if (originalString.equals(reversedString)) {
                System.out.println("Введений рядок є паліндромом");
            } else {
                System.out.println("Введений рядок не є паліндромом");
            }

            scanner.close();
        }
    }

