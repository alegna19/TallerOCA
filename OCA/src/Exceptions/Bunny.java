package Exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anggomez1
 */
public class Bunny extends Exception {

    public static void main(String[] args) throws NoMoreCarrotsException {
        eatCarrot();
    }

    public static void eatCarrot() throws NoMoreCarrotsException {

    }
}
