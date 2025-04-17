package pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model;

import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Interfaces.Employee;

/**
 * The fundamental factory class.
 */
public abstract class Department {

    public String work(){

        Employee employee = createEmployee();
        return employee.doJob();

    }

    public String rest() {

        Employee employee = createEmployee();
        return employee.takeBreak();
    }

    /**
     * Subclasses will override this method in order to create specific Employee
     * objects.
     */
    public abstract Employee createEmployee();

}
