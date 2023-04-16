package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class TechnicalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String brand;
    String model;

    Integer mileage;
    String status;
    Integer cubicCapacity;
    Integer power;
    String fuel;
    Double fuelConsumption;
    String body;

    Integer length;
    Integer width;
    Integer height;
    Integer ownWeight;
    Integer maximumWeight;

    @OneToOne(fetch = FetchType.LAZY)
    private Vehicle vehicle;

}
