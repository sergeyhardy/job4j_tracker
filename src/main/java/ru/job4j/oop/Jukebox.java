package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже" + System.lineSeparator()
                    + "Пешеходы по лужам, " + System.lineSeparator()
                    + "А вода по асфальту рекой. " + System.lineSeparator()
                    + "И не ясно прохожим " + System.lineSeparator()
                    + "В этот день непогожий " + System.lineSeparator()
                    + "Почему я весёлый такой." + System.lineSeparator());
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят," + System.lineSeparator()
                    + "Одеяла и подушки ждут ребят." + System.lineSeparator()
                    + "Даже сказка спать ложится," + System.lineSeparator()
                    + "Чтобы ночью нам присниться." + System.lineSeparator()
                    + "Ты ей пожелай: «Баю-бай!»" + System.lineSeparator());
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
