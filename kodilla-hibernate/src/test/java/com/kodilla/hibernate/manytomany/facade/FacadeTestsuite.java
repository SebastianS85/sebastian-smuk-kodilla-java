package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestsuite {

    @Autowired
    CompanyFacade companyFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void facadeTestFindByCompanySign() throws SearchExeption {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Masters");
        Company dataInc = new Company("DataInc");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(dataInc);
        companyDao.save(greyMatter);

        //Then
        List<Company> companies = companyFacade.getCompanyWith("data");

        //Then
        Assert.assertEquals(2,companies.size());
        Assert.assertEquals("Data Masters",companies.get(0).getName());
        Assert.assertEquals("DataInc",companies.get(1).getName());
        //Clean up
        companyDao.delete(softwareMachine);
        companyDao.delete(dataMaesters);
        companyDao.delete(dataInc);
        companyDao.delete(greyMatter);

    }
    @Test
    public void facadeEmployeeFindBySign() throws SearchExeption {
        //Given
        Employee employee1=new Employee("Jan","Kowalski");
        Employee employee2=new Employee("Mark","Tkowski");
        Employee employee3=new Employee("Jan","Brzechwa");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        //When
        List<Employee> employees=companyFacade.getEmployeeWith("ki");
        //Then
        Assert.assertEquals(2,employees.size());

        //Clean up
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
        employeeDao.delete(employee3);
    }

}
