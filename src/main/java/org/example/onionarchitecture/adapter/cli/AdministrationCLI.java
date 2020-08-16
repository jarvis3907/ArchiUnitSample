package org.example.onionarchitecture.adapter.cli;


import org.example.onionarchitecture.adapter.persistence.ProductRepository;
import org.example.onionarchitecture.application.AdministrationPort;
import org.example.onionarchitecture.application.ShoppingApplication;

@SuppressWarnings("unused")
public class AdministrationCLI {
    public static void main(String[] args) {
        AdministrationPort port = ShoppingApplication.openAdministrationPort();
        handle(args, port);
    }

    private static void handle(String[] args, AdministrationPort port) {
        // violates the pairwise independence of adapters
        ProductRepository repository = port.getInstanceOf(ProductRepository.class);
        long count = repository.getTotalCount();
        // parse arguments and re-configure application according to count through port
    }
}
