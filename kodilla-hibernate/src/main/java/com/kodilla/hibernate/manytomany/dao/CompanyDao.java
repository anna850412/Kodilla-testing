package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository <Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> selectFirstThreeDigitsFromCompanyName(String name);
    @Query(nativeQuery = true)
    List<Company> selectCompanyByPartOfTheName(String param);
}