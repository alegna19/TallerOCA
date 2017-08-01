package com.desarrollotaeller;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Validate greater number
 *
 * @author anggomez1
 */
public class Ejercicio02 {

    int valor = 0;
    int[] arreglo = new int[3];
    Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        Ejercicio02 ej = new Ejercicio02();
        ej.llenarArreglo();
        ej.imprimirValoresArreglo();
    }

    /*+
     * LLenar un arreglo de 3 posiciones
     */
    public void llenarArreglo() {
        for (int index = 0; index < arreglo.length; index++) {
            System.out.println("Ingrese el valor " + (index + 1));
            valor = sc.nextInt();
            arreglo[index] = valor;
        }
       Arrays.sort(arreglo); ;// Método para ordenar los arreglos de menor a mayor.
    }

    /*+
     * Recorre imprimiendo los valores del arreglo.
     */
    public void imprimirValoresArreglo() {
        for (int printArr : arreglo) {
            System.out.print(printArr + ",");
        }

    }

}
