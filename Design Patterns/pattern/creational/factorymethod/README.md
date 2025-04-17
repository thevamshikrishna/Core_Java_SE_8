# Factory-Method pattern

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a 
class defer instantiation to subclasses.

### Explanation

The company has departments (IT and Financial). It department hires developers, financial department can hire 
i.e. accountants. Depending on which employee is needed department can hire accurate employee.

### According to Wikipedia
In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with 
the problem of creating objects without having to specify the exact class of the object that will be created. This is 
done by creating objects by calling a factory method — either specified in an interface and implemented by child 
classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a 
constructor.

### Programming example
In our example, at the beginning, we have Employee interface and two its implementations.

```java
public interface Employee {

    String doJob();
    String takeBreak();
}
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

    public class FinanceDepartmentEmployee implements Employee {

        private Seniority seniority;
        private Section section;

        private final String financeEmployeeWork = "I am counting money!";
        private final String financeEmployeeBreak = "I am going for a coffee and back to work!";


        public FinanceDepartmentEmployee(Seniority seniority, Section section) {
            this.seniority = seniority;
            this.section = section;
        }

        @Override
        public String doJob() {

            return this + " " + financeEmployeeWork;
        }

        @Override
        public String takeBreak() {

            return this + " " + financeEmployeeBreak;
        }

        @Override
        public String toString() {
            return String.format("FinanceDepartmentEmployee{seniority = %s, section = %s}", this.seniority, this.section);
        }
    }
```
To create new employees we use proper department
```java
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
```



