package org.example.layers.service;


import org.example.layers.controller.ComplexControllerAnnotation;
import org.example.layers.controller.one.SomeEnum;

public @interface ComplexServiceAnnotation {
    ComplexControllerAnnotation controllerAnnotation();

    SimpleServiceAnnotation simpleServiceAnnotation();

    SomeEnum controllerEnum();

    ServiceType serviceType();
}
