package org.example.mapper;

import org.example.entity.User;
import org.example.entity.Vehicle;
import org.example.model.VehicleRequest;
import org.example.model.VehicleResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
    VehicleResponse map(Vehicle vehicle);
    Vehicle map(VehicleRequest vehicleRequest);

    List<VehicleResponse> map(List<Vehicle> all);
}
