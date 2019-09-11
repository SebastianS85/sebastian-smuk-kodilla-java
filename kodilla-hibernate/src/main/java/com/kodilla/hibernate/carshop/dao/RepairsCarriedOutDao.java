package com.kodilla.hibernate.carshop.dao;

import com.kodilla.hibernate.carshop.RepairsCarriedOut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface RepairsCarriedOutDao extends CrudRepository<RepairsCarriedOut,Integer> {
}
