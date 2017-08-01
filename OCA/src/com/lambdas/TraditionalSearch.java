package com.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anggomez1
 */
public class TraditionalSearch {

   static public  void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //print(animals, new CheckIfHopper());
        print(animals, new CheckIfHopper());
        //print(animals,  a ->  a.isCanHop());  
        print(animals, a ->  a.isCanHop());
        //print(animals, a -> a.isCanSwim());
        
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) { //stream, permite manipular una collecion o lista.
            if (checker.test(animal)) { //filter y remueve los que no cumplen con la condición del predicado.
                System.out.print(animal + " ");// ::
            }
        }
        System.out.println();
    }
}
