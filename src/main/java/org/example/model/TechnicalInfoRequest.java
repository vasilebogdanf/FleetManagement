package org.example.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TechnicalInfoRequest {
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
}
