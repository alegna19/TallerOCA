package com.lambdas;

/**
 *
 * @author anggomez1
 */
public class CheckIfHopper implements CheckTrait{


    @Override
    public boolean test(Animal a) {
        return a.isCanHop();
        //return a.isCanSwim();
    }

}
