package final_solutions;

import chapter_6.super_keyword_usage.Employee;

public class Q58 {

}

class Employees {
    String name;
    boolean contract;
    double salary;

    Employees() {
    // line n1
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employees employees = new Employees();
//        name = new String("Joe");
        System.out.println(employees);
    }
}
