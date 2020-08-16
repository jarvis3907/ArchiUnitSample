package org.example.layers.service;


import org.example.layers.MyService;
import org.example.layers.controller.ComplexControllerAnnotation;
import org.example.layers.controller.SimpleControllerAnnotation;
import org.example.layers.controller.SomeGuiController;
import org.example.layers.controller.one.SomeEnum;
import org.example.layers.controller.one.UseCaseOneTwoController;
import org.example.layers.controller.two.UseCaseTwoController;
import org.example.layers.security.Secured;

@MyService
@ComplexServiceAnnotation(
        controllerAnnotation = @ComplexControllerAnnotation(simpleControllerAnnotation = @SimpleControllerAnnotation),
        simpleServiceAnnotation = @SimpleServiceAnnotation,
        controllerEnum = SomeEnum.DISPATCH,
        serviceType = ServiceType.STANDARD
)
public class ServiceViolatingLayerRules {
    public static final String illegalAccessToController = "illegalAccessToController";
    public static final String doSomething = "doSomething";
    public static final String dependentMethod = "dependentMethod";

    void illegalAccessToController() {
        System.out.println(UseCaseOneTwoController.someString);
        UseCaseTwoController otherController = new UseCaseTwoController();
        otherController.doSomethingTwo();
    }

    public void doSomething() {
    }

    public SomeGuiController dependentMethod(UseCaseTwoController otherController) {
        return null;
    }

    @Secured
    public void properlySecured() {
    }
}
