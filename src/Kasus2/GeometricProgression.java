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
public class GeometricProgression extends Progression {
    protected int base;

    public GeometricProgression(int start, int base) {
        super(start);
        this.base = base;
    }
    
    @Override
    public void advance() {
        nextValue *= base;
    }
}
