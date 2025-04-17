package pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model;

import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.Seniority;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.TechStack;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Interfaces.Employee;

/**
 * ItDepartment will produce developers
 */

public class ItDepartment extends Department {

    private final Seniority seniority;
    private final TechStack techStack;

    public ItDepartment(final Seniority seniority, final TechStack techStack){

        this.seniority = seniority;
        this.techStack = techStack;
    }
    @Override
    public Employee createEmployee() {
        return new Developer(seniority, techStack);
    }

}
