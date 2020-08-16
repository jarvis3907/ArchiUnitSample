package junit4;


import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.example.layers.AbstractController;
import org.example.layers.MyController;
import org.example.layers.MyService;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.tngtech.archunit.example.layers")
public class NamingConventionTest {

    @ArchTest
    public static ArchRule services_should_be_prefixed =
            classes()
                    .that().resideInAPackage("..service..")
                    .and().areAnnotatedWith(MyService.class)
                    .should().haveSimpleNameStartingWith("Service");

    @ArchTest
    public static ArchRule controllers_should_not_have_Gui_in_name =
            classes()
                    .that().resideInAPackage("..controller..")
                    .should().haveSimpleNameNotContaining("Gui");

    @ArchTest
    public static ArchRule controllers_should_be_suffixed =
            classes()
                    .that().resideInAPackage("..controller..")
                    .or().areAnnotatedWith(MyController.class)
                    .or().areAssignableTo(AbstractController.class)
                    .should().haveSimpleNameEndingWith("Controller");

    @ArchTest
    public static ArchRule classes_named_controller_should_be_in_a_controller_package =
            classes()
                    .that().haveSimpleNameContaining("Controller")
                    .should().resideInAPackage("..controller..");

}
