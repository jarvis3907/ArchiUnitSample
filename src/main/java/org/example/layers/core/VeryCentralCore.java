package org.example.layers.core;


import org.example.layers.SomeOtherBusinessInterface;
import org.example.layers.web.AnnotatedController;

@HighSecurity
@SuppressWarnings("unused")
public class VeryCentralCore implements SomeOtherBusinessInterface {
    public static final String DO_CORE_STUFF_METHOD_NAME = "doCoreStuff";

    public void doCoreStuff() {
    }

    void coreDoingIllegalStuff() {
        new AnnotatedController();
    }
}
