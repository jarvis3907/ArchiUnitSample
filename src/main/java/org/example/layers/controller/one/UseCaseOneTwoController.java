package org.example.layers.controller.one;


import org.example.layers.controller.two.UseCaseTwoController;

public class UseCaseOneTwoController {
    public static final String doSomethingOne = "doSomethingOne";
    public static String someString = "someString";

    public void doSomethingOne() {
        new UseCaseTwoController().doSomethingTwo();
    }
}
