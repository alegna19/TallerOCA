package com.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anggomez1
 */
public class ListBunnies {

    String s = "";

    public static void main(String[] arg) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        //System.out.println(bunnies);

        bunnies.removeIf(s -> s.charAt(0) == 'h');
        System.out.println(bunnies); // [hoppy]  
    }

}
