package com.kodilla.kodilla.patterns2.com.kodilla.patterns2.adapter.company;

import com.kodilla.kodilla.patterns2.adapter.company.SalaryAdapter;
import com.kodilla.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testTotalSalary(){
    //Given
        Workers workers =new Workers();
        SalaryAdapter salaryAdapter=new SalaryAdapter();
    //When
    double totalSalary=salaryAdapter.TotalSalary(workers.getWorkers(),workers.getSalaries());
    //Then
        System.out.println(totalSalary);
        assertEquals(22700.0,totalSalary,0.0);
    }
}
