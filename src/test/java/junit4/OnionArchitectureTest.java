package junit4;


import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.example.onionarchitecture.domain.model.OrderItem;
import org.example.onionarchitecture.domain.service.OrderQuantity;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.tngtech.archunit.example.onionarchitecture")
public class OnionArchitectureTest {

    @ArchTest
    static final ArchRule onion_architecture_is_respected = onionArchitecture()
            .domainModels("..domain.model..")
            .domainServices("..domain.service..")
            .applicationServices("..application..")
            .adapter("cli", "..adapter.cli..")
            .adapter("persistence", "..adapter.persistence..")
            .adapter("rest", "..adapter.rest..");

    @ArchTest
    static final ArchRule onion_architecture_is_respected_with_exception = onionArchitecture()
            .domainModels("..domain.model..")
            .domainServices("..domain.service..")
            .applicationServices("..application..")
            .adapter("cli", "..adapter.cli..")
            .adapter("persistence", "..adapter.persistence..")
            .adapter("rest", "..adapter.rest..")

            .ignoreDependency(OrderItem.class, OrderQuantity.class);
}
