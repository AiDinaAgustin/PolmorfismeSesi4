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
public class ArithmeticProgression extends Progression {

    protected int increment;

    public ArithmeticProgression(int start, int increment) {
        super(start);
        this.increment = increment;
    }

    @Override
    public void advance() {
        nextValue += increment;
    }
}
