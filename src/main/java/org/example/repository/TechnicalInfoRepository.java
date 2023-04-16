package org.example.repository;

import org.example.entity.TechnicalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TechnicalInfoRepository extends JpaRepository<TechnicalInfo,Integer> {
    @Query("select t from TechnicalInfo t where t.brand= :brand")
    List<TechnicalInfo> findByBrand(@Param("brand") String brand);
}
