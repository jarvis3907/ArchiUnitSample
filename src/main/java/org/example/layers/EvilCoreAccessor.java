package org.example.layers;


import org.example.layers.core.VeryCentralCore;

@SuppressWarnings("unused")
public class EvilCoreAccessor {
    void iShouldNotAccessCore() {
        new VeryCentralCore().doCoreStuff();
    }
}
