package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        String[] leftArray = left.split("\\. ");
        String[] rightArray = right.split("\\. ");
        for (int i = 0; i < Math.min(leftArray.length, rightArray.length); i++) {
           rsl = Integer.compare(Integer.parseInt(leftArray[i]), Integer.parseInt(rightArray[i]));
           if (rsl != 0) {
               break;
           }
        }
        return rsl;
    }
}