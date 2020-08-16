package org.example.layers.controller;


import org.example.layers.service.ServiceViolatingDaoRules;
import org.example.layers.service.ServiceViolatingLayerRules;

public class SomeController {
    private ServiceViolatingDaoRules service;
    private ServiceViolatingLayerRules otherService;

    void doSthController() {
        service.doSthService();
    }

    void doSthWithSecuredService() {
        otherService.properlySecured();
    }
}
