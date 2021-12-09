package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("1984", 450);
        Book second = new Book("We", 159);
        Book third = new Book("Clean code", 464);
        Book fourth = new Book("Fahrenheit 451", 320);
        Book[] books = {first, second, third, fourth};
        for (int i = 0; i < books.length; i++) {
            Book y = books[i];
            System.out.println(y.getName() + " - " + y.getPageCount());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book y = books[i];
            System.out.println(y.getName() + " - " + y.getPageCount());
        }
        for (int i = 0; i < books.length; i++) {
            Book y = books[i];
            if ("Clean code".equals(y.getName())) {
                System.out.println(y.getName() + " - " + y.getPageCount());
            }
        }
    }
}
