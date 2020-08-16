package org.example.layers;


import org.example.layers.thirdparty.ThirdPartyClassWithProblem;
import org.example.layers.thirdparty.ThirdPartyClassWorkaroundFactory;
import org.example.layers.thirdparty.ThirdPartySubClassWithProblem;

public class ClassViolatingThirdPartyRules {
    ThirdPartyClassWithProblem illegallyInstantiateThirdPartyClass() {
        return new ThirdPartyClassWithProblem();
    }

    ThirdPartyClassWithProblem correctlyInstantiateThirdPartyClass() {
        return new ThirdPartyClassWorkaroundFactory().create();
    }

    ThirdPartySubClassWithProblem illegallyInstantiateThirdPartySubClass() {
        return new ThirdPartySubClassWithProblem();
    }

    ThirdPartySubClassWithProblem correctlyInstantiateThirdPartySubClass() {
        return new ThirdPartyClassWorkaroundFactory().createSubClass();
    }
}
