package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);


    public List<Company> getCompanyWith(String signs) {
        LOGGER.info("searching company with: "+signs);
        return companyDao.retrieveCompanyWithSign(signs);

    }

    public List<Employee>getEmployeeWith(String signs){
        LOGGER.info("searching employee with: "+signs);
        return employeeDao.retrieveEmployeeWithNameSign(signs);
    }
}
