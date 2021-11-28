package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        System.out.print("При встрече с зайцем: ");
        Hare.tryEat();
        System.out.print("При встрече с волком: ");
        Wolf.tryEat();
        System.out.print("При встрече с лисой: ");
        Fox.tryEat();
    }

}
