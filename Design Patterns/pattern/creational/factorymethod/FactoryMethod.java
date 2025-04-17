package pl.vm.javaguild.designpatterns.pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Department;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.Seniority;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.TechStack;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.ItDepartment;

/**
 * Demo class. Example of factory-method pattern working.
 */

@Slf4j
public class FactoryMethod {

    public static void main(String[] args) {

        // The company has to hire Senior Full-Stack dev
        Department department = new ItDepartment(Seniority.SENIOR, TechStack.FULL_STACK);
        log.info(department.work());


    }
}