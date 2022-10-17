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
public class ProgressionDemo {

    /**
     * Defines a few progression objects of different progression classes and prints
     * the first 20 values of each to System.out. It is simply meant as an
     * introductory example of polymorphism.
     */
    public static void main(String[] args) {
        showInitialSequence(new ArithmeticProgression(10, 4));
        System.out.println("====================================\n");
        showInitialSequence(new ArithmeticProgression(-25, 5));
        System.out.println("====================================\n");
        showInitialSequence(new GeometricProgression(1, 2));
        System.out.println("====================================\n");
        showInitialSequence(new FibonacciProgression());
    }

    /**
     * Displays the first 20 values from the given progression.
     */
    public static void showInitialSequence(Progression p) {
        System.out.print("( ");
        for (int i = 0; i < 20; i++) {
            System.out.print(p.next() + " ");
        }
        System.out.println(")");
    }
}
