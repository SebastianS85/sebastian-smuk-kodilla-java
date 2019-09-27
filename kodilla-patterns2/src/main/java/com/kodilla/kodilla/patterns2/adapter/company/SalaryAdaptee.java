package com.kodilla.kodilla.patterns2.adapter.company;

import com.kodilla.kodilla.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.kodilla.patterns2.adapter.company.newhrsystem.SalaryProcessor;
import com.kodilla.kodilla.patterns2.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor companySalaryProcessor=new CompanySalaryProcessor();
        return companySalaryProcessor.calculateSalaries(employees);
    }
}
