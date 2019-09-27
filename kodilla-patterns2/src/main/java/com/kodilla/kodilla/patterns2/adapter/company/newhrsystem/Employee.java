package com.kodilla.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    private String peselId;
    private String firstname;
    private String lastname;
    private BigDecimal salary;

    public Employee(String peselId, String firstname, String lastname, BigDecimal salary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getPeselId() != null ? !getPeselId().equals(employee.getPeselId()) : employee.getPeselId() != null)
            return false;
        if (getFirstname() != null ? !getFirstname().equals(employee.getFirstname()) : employee.getFirstname() != null)
            return false;
        if (getLastname() != null ? !getLastname().equals(employee.getLastname()) : employee.getLastname() != null)
            return false;
        return getSalary() != null ? getSalary().equals(employee.getSalary()) : employee.getSalary() == null;
    }

    @Override
    public int hashCode() {
        int result = getPeselId() != null ? getPeselId().hashCode() : 0;
        result = 31 * result + (getFirstname() != null ? getFirstname().hashCode() : 0);
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        result = 31 * result + (getSalary() != null ? getSalary().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
