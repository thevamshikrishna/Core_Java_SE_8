package pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model;

import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.Section;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.Seniority;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Interfaces.Employee;

/**
 * FinanceDepartmentEmployee implementation
 */

public class FinanceDepartmentEmployee implements Employee {

    private final Seniority seniority;
    private final Section section;

    private final String FINANCE_EMPLOYEE_WORK = "I am counting money!";
    private final String FINANCE_EMPLOYEE_BREAK = "I am going for a coffee and back to work!";


    public FinanceDepartmentEmployee(final Seniority seniority, final Section section) {
        this.seniority = seniority;
        this.section = section;
    }

    @Override
    public String doJob() { return this + " " + FINANCE_EMPLOYEE_WORK; }

    @Override
    public String takeBreak() { return this + " " + FINANCE_EMPLOYEE_BREAK; }

    @Override
    public String toString() {
        return String.format("FinanceDepartmentEmployee{seniority = %s, section = %s}", this.seniority, this.section);
    }
}
