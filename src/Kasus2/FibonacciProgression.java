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
public class FibonacciProgression extends Progression {

    protected int previous;

    public FibonacciProgression() {
        super(0);
        previous = 1; 
    }
    @Override
    public void advance() {
        int oldPreviousValue = previous;
        previous = nextValue;
        nextValue += oldPreviousValue;
    }
}
