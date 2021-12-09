package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("1984", 450);
        Book second = new Book("We", 159);
        Book third = new Book("Clean code", 464);
        Book fourth = new Book("Fahrenheit 451", 320);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
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
