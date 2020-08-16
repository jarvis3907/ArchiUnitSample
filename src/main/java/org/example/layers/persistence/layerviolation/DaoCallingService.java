package org.example.layers.persistence.layerviolation;


import org.example.layers.SomeMediator;
import org.example.layers.service.ServiceInterface;
import org.example.layers.service.ServiceViolatingLayerRules;

public class DaoCallingService implements ServiceInterface {
    public static final String violateLayerRules = "violateLayerRules";
    public static final String violateLayerRulesTrickily = "violateLayerRulesTrickily";

    ServiceViolatingLayerRules service;

    void violateLayerRules() {
        service.doSomething();
    }

    void violateLayerRulesTrickily() {
        new SomeMediator(service).violateLayerRulesIndirectly();
    }
}
