package main;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import test.models.TestCase1;
import test.models.TestCase2;
import test.models.TestCase3;

public class Main {

    public static void main(String args[]) {

        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        junit.run(
                TestCase1.class,
                TestCase2.class,
                TestCase3.class
        );
    }
}



