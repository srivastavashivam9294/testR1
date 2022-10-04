package org.example;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student() ;
        p1.setFirstName("Vinod");
        System.out.println( "Student is " +  p1.getFirstName());
        Student stu = new Student();
        stu.setSubject("zzzz");
        Employee emp = new Employee();
        emp.setSalaryMonthly(100000);

    }


}