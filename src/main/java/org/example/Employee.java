package org.example;

public class Employee extends Person {
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    private Integer salary ;

}
