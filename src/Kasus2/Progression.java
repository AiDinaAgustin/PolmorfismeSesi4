/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author ASUS
 */
public abstract class Progression {

    /**
     * The place to store the next value to return from next()
     */
    protected int nextValue;

    //Overloading
    public Progression() {
        nextValue = 0;
    }

    public Progression(int initialValue) {
        nextValue = initialValue;
    }

    public int next() {
        int valueToReturn = nextValue;
        advance();
        return valueToReturn;
    }

    public abstract void advance();
}
