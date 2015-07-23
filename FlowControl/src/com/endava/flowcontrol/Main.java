/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

import com.endava.flowcontrol.exceptions.OverflowException;
import com.endava.flowcontrol.exceptions.UnderflowException;

import java.util.Arrays;

public class Main {

    private static MonkeyTrouble e1 = new MonkeyTrouble();
    private static ParrotTrouble e2 = new ParrotTrouble();
    private static PosNeg e3 = new PosNeg();
    private static BackAround e4 = new BackAround();
    private static EveryNth e5 = new EveryNth();
    private static ScoresIncreasing e6 = new ScoresIncreasing();
    private static SumHeights e7 = new SumHeights();
    private static MemoryErrors e8 = new MemoryErrors();
    private static Calculator e9 = new Calculator();
    private static FinallyPriority e10 = new FinallyPriority();

    public static void main(String[] args) {
        System.out.println("Testing MonkeyTrouble.......\n\t" + e1.monkeyTrouble(true, true) + "\n\t" +
                e1.monkeyTrouble(true, false));
        System.out.println("Testing ParrotTrouble.......\n\t" + e2.parrotTrouble(true, 6) + "\n\t" +
                e2.parrotTrouble(true, 19));
        System.out.println("Testing PosNeg.......\n\t" + e3.posNeg(10, -3, false) + "\n\t" +
                e3.posNeg(-2, -2, true));
        System.out.println("Testing BackAround.......\n\t" + e4.backAround("Hello") + "\n\t" +
                e4.backAround("at"));
        System.out.println("Testing EveryNth.......\n\t" + e5.everyNth("abcdefg", 2) + "\n\t" +
                e5.everyNth("I don't have ideas", 3));
        System.out.println("Testing ScoresIncreasing.......\n\t" + e6.scoresIncreasing(new int[]{2, 4, 6, 9}) + "\n\t" +
                e6.scoresIncreasing(new int[]{2, 9, 7, 22}));
        System.out.println("Testing SumHeights.......\n\t" + e7.sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4) + "\n\t" +
                e7.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
        try {
            System.out.println("Testing Calculator.......\n\t The sum of 23 and 92 is " + e9.add(23, 92) +
                    "The average value of {2, 9, 6, 17} is " + e9.average(Arrays.asList(new Integer[]{2, 6, 9, 17})));
        } catch (OverflowException | UnderflowException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Testing FinallyPriority.......\n\t");
        System.out.println("\t" + e10.returnFinally());
    }
}
