package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        System.out.println("Вопрос: " + question);
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Ответ: Да");
        } else if (answer == 1) {
            System.out.println("Ответ: Нет");
        } else {
            System.out.println("Ответ: Может быть");
        }
    }
}
