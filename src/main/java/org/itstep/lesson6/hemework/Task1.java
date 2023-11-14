package org.itstep.lesson6.hemework;

import java.util.Scanner;

public class Task1 {
    // Завдання 3:
    //Користувач вводить з клавіатури рядок, слово для пошуку та
    //слово для заміни. Здійсніть у рядку заміну одного слова іншим.
    //Отриманий рядок виведіть на екран.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рдок: ");
        String text = scanner.nextLine();

        System.out.print("Введіть слово для пошуку: ");
        String wordToSearch = scanner.next();

        System.out.print("Введіть слово для заміни: ");
        String wordToReplace = scanner.next();

        String replacedText = text.replace(wordToSearch, wordToReplace);

        System.out.println("Отриманий рядок: " + replacedText);

        scanner.close();
    }
}
