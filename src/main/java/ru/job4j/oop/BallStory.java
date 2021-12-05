package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        System.out.print("При встрече с зайцем: ");
        hare.tryEat(ball);
        System.out.print("При встрече с волком: ");
        wolf.tryEat(ball);
        System.out.print("При встрече с лисой: ");
        fox.tryEat(ball);
    }

}
