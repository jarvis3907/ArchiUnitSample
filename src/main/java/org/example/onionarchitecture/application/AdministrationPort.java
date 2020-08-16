package org.example.onionarchitecture.application;

public interface AdministrationPort {
    <T> T getInstanceOf(Class<T> type);
}
