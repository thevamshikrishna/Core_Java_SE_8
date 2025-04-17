/*
Aggregation is a weaker form of association where the child
object can exist independently of the parent object.
*/

import java.util.List;
import java .util.ArrayList;

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private List<Department> departments;

    public University() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        University university = new University();
        university.addDepartment(cs);
        university.addDepartment(ee);

        for (Department dept : university.getDepartments()) {
            System.out.println("Department: " + dept.getName());
        }
    }
}