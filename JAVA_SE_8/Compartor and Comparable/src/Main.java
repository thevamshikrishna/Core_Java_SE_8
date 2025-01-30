import com.fi.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<>();
        li.add(new Employee(3,"Raja", 5000));
        li.add(new Employee(2,"Raju",20000));
        li.add(new Employee(1,"Vamshi", 10000));
//        Comparator<Employee> sortById = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getId()-o2.getId();
//            }
//        };
//        Comparator<Employee> sortByName = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//        Comparator<Employee> sortBySalary = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary()-o2.getSalary());
//            }
//        };
        System.out.println("By ID");
        Collections.sort(li, (Employee e1, Employee e2)->e1.getId()-e2.getId());
        System.out.println(li);
        System.out.println("By NAme");
        Collections.sort(li, (Employee e1, Employee e2)->e1.getName().compareTo(e2.getName()));
        System.out.println(li);
        System.out.println("By Salary");
        Collections.sort(li, (Employee e1, Employee e2)->(int) (e1.getSalary()-e2.getSalary()));
        System.out.println(li);
    }
}