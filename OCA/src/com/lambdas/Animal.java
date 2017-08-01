package com.lambdas;

/**
 *
 * @author anggomez1
 */
public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Animal(String speciesName, boolean hopper, boolean swimeer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimeer;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public void setCanHop(boolean canHop) {
        this.canHop = canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return species + "";
    }

    void canHop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
