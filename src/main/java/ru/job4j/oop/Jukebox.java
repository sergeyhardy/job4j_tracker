package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже \n" + "Пешеходы по лужам, \n" + "А вода по асфальту рекой. \n" + "И не ясно прохожим \n" + "В этот день непогожий \n" + "Почему я весёлый такой.\n");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят,\n" + "Одеяла и подушки ждут ребят.\n" + "Даже сказка спать ложится,\n" + "Чтобы ночью нам присниться.\n" + "Ты ей пожелай: «Баю-бай!»\n");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox first = new Jukebox();
        first.music(1);
        first.music(2);
        first.music(3);
    }
}
