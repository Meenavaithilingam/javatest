package com.kgisl.task;

import java.util.Scanner;

/**
 * CharCount
 */
public class CharCount {
    static void count(String firstname) {

        char[] ch = firstname.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            String s = "";

            while (i < ch.length && ch[i] != ' ') {

                s = s + ch[i];
                i++;
            }

            if (s.length() > 0)
                System.out.println("your firstname has" + " " + s.length() + " " + "characters");
        }
    }

    static void count1(String lastname) {

        char[] ch = lastname.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            String s = "";

            while (i < ch.length && ch[i] != ' ') {

                s = s + ch[i];
                i++;
            }

            if (s.length() > 0)
                System.out.println("your lastname has" + " " + s.length() + " " + "characters");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your first name:");
        String firstname = scan.nextLine();
        System.out.println("Type your lastt name:");
        String lastname = scan.nextLine();
        String fullname = firstname + lastname;
        System.out.println("Your full name is:" + fullname);
        count(firstname);
        count(lastname);
    }
}