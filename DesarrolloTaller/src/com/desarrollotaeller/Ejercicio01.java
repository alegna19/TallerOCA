package com.desarrollotaeller;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Validate id the number is even or odd number.
 *
 * @author anggomez1
 */
public class Ejercicio01 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Object[][][] cubbies = new Object[3][0][5];
int[] random = { 6, -4, 12, 0, -10 };
int x = 12;
int y = Arrays.binarySearch(random, x);
System.out.println("Valor de YYYY" + y);

        String a = "";
        a += 2;
        a += 'C';
        a += false;
        if (a.equals("2cfalse"));
        System.out.println("equals" + " " + a);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number that you typed " + num + ", is Even  ");
        } else {
            System.out.println("The number that you typed " + num + ", is Odd  ");
        }
    }

}
