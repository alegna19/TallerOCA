package com.test.predicate;

import com.lambdas.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author anggomez1
 */
public class PredicateSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals,  a ->  a.isCanHop());
        //print(animals, a -> a.isCanSwim());
        
        //java.util.function.Function
      
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {  
        animals.stream().filter(checker).forEach(System.out::println);
       
    }
}
