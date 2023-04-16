package org.example.repository;

import org.example.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    @Query("select t from Vehicle t where t.registrationNumber= :registrationNumber")
    List<Vehicle> findByRegistrationNumber(@Param("registrationNumber")
                                           String registrationNumber);

}
