package org.example.layers.anticorruption;


import org.example.layers.anticorruption.internal.InternalType;

class InternalUtility {
    InternalType okaySinceTheVisibilityIsNonPublic() {
        return new InternalType();
    }
}
