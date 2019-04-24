package com.kgisl.task;

import java.util.ArrayList;
import java.util.List;

/**
 * RemoveDuplicate
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();
        li.add("production");
        li.add("accounts");
        li.add("opertions");
        li.add("finance");
        li.add("opertions");
        System.out.println(li.toString());
        for (int i = 0; i < li.size(); i++) {

            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(i).equals(li.get(j))) {
                    li.remove(j);
                    j--;
                }
            }
        }
        System.out.println(li.toString());
    }
}
// Set<String> s = new LinkedHashSet<String>(li);
// System.out.println(s);
// Object[] st = li.toArray();
// for (Object s : st) {
// if (li.indexOf(s) == li.lastIndexOf(s)) {
// System.out.println(s);
// }
// }