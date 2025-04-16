package Example2;

public class Main2 {
    public static void main(String[] args) {
       // Employee employee=()->{return "Vamshi";};
        Employee employee = System.out::println;
        //System.out.println(employee.getName());
       employee.getName("Vamshi");

        Employee editor=System.out::println;
        editor.getName("Editor");

    }
}
