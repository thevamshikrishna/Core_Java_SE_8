package pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model;

import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.Section;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.Seniority;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Interfaces.Employee;

/**
 * FinancialDepartment will produce financial department employees
 */
public class FinancialDepartment extends Department {

    private final Seniority seniority;
    private final Section section;

    public FinancialDepartment(final Seniority seniority, final Section section) {
        this.seniority = seniority;
        this.section = section;
    }

    @Override
    public Employee createEmployee() {
        return new FinanceDepartmentEmployee(seniority, section);
    }

}
