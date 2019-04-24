package com.kgisl.task;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrListToArr
 */
public class ArrListToArr {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("kgisl");
        al.add("gss");
        al.add("bss");
        System.out.println("ArrayList:" + al);

        String s[] = new String[al.size()];
        for (int j = 0; j < al.size(); j++) {
            s[j] = al.get(j);
        }
        for (String a : s)
            System.out.println(a);

    }
}
