package org.example.layers.controller;


import org.example.layers.service.ServiceHelper;

public class SomeGuiController {
    void callServiceLayer() {
        ServiceHelper helper = new ServiceHelper();
        new ServiceHelper("this is okay");

        process(helper.insecure);
        process(helper.properlySecured);
    }

    private void process(Object object) {
    }
}
