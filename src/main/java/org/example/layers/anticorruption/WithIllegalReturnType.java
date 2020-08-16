package org.example.layers.anticorruption;


import org.example.layers.anticorruption.internal.InternalType;

/**
 * We want classes in this layer to only return type {@link WrappedResult}, thus this interface here
 * is ill-behaved.
 */
public interface WithIllegalReturnType {
    InternalType directlyReturnInternalType();

    int otherIllegalMethod(String param);

    WrappedResult allowedMethod();
}
