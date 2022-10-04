package org.example;

public class Employee extends Person {
    public Integer getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setSalaryMonthly(Integer salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }

    private Integer salaryMonthly;

}
