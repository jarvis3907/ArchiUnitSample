package org.example.layers.controller.two;


import org.example.layers.AbstractController;
import org.example.layers.controller.one.UseCaseOneTwoController;

public class UseCaseTwoController extends AbstractController {
    public static final String doSomethingTwo = "doSomethingTwo";

    public void doSomethingTwo() {
        new UseCaseOneTwoController().doSomethingOne();
    }
}
