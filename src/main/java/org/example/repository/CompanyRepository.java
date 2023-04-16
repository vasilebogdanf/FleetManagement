package org.example.repository;

import org.example.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface CompanyRepository extends JpaRepository<Company,Integer> {
    @Query("select t from Company t where t.name= :name")
    List<Company> findByName(@Param("name") String name);
}
