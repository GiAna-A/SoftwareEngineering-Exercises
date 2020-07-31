package spielwiese.java8.hackerrank;

import java.util.List;

public class Odd {

    public int findNthOddElement(List<Integer> list, int gesuchteUngeradeZahl) {

        int gefundenUngeradeZahl = 0;
        int ungeradeZahl = 0;
        for (Integer unbekannteZahl : list) {
            if (unbekannteZahl % 2 == 1) {
                gefundenUngeradeZahl++;
                if (gesuchteUngeradeZahl == gefundenUngeradeZahl) {
                    ungeradeZahl = unbekannteZahl;
                    break;
                }

            }


        }
        if(gesuchteUngeradeZahl>gefundenUngeradeZahl){
            throw new IndexOutOfBoundsException("Liste zu klein");
        }
        return gefundenUngeradeZahl;

    }


}
