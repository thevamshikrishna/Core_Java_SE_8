package pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model;

import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.Seniority;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Enums.TechStack;
import pl.vm.javaguild.designpatterns.pattern.creational.factorymethod.model.Interfaces.Employee;

/**
 * Developer implementation
 */

public class Developer implements Employee {

    private final Seniority seniority;
    private final TechStack techStack;

    private final String DEV_WORK = "I have no idea what I'm doing!";
    private final String DEV_BREAK = "Let's play table football!";

    public Developer(final Seniority seniority, final TechStack techStack) {

        this.seniority = seniority;
        this.techStack = techStack;

    }

    @Override
    public String doJob() {
        return this + " " + DEV_WORK;
    }

    @Override
    public String takeBreak() {
        return this + " " + DEV_BREAK;
    }

    @Override
    public String toString() {
        return String.format("Developer{seniority = %s, techStack = %s}", this.seniority, this.techStack);
    }
}
