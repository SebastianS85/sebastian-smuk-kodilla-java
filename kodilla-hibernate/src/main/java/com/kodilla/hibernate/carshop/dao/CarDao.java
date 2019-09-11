package com.kodilla.hibernate.carshop.dao;

import com.kodilla.hibernate.carshop.CarList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CarDao extends CrudRepository<CarList,Integer>{

}
