package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Vehicle;
import org.example.exception.BusinessException;
import org.example.mapper.VehicleMapper;
import org.example.model.VehicleRequest;
import org.example.model.VehicleResponse;
import org.example.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    public List<VehicleResponse> findAll() {
        return vehicleMapper.map(vehicleRepository.findAll());
    }

    public VehicleResponse findById(Integer id) {
        Vehicle vehicle = vehicleRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the user with ID: " + id));
        return vehicleMapper.map(vehicle);
    }
    public VehicleResponse save(VehicleRequest vehicleRequest) {
        Vehicle vehicle=vehicleMapper.map(vehicleRequest);
        return vehicleMapper.map(vehicleRepository.save(vehicle));
    }


    public List<VehicleResponse> findByRegistrationNumber(String registrationNumber) {
        List<Vehicle> byRegistrationNumber = vehicleRepository.findByRegistrationNumber(registrationNumber);
        return vehicleMapper.map(byRegistrationNumber);
    }

    public void deleteById(Integer id) {
        Vehicle vehicle = vehicleRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find with Id " + id));
        vehicleRepository.deleteById(vehicle.getId());
    }

    public VehicleResponse updateById(VehicleRequest vehicleRequest, Integer id) {
        Vehicle vehicle=vehicleRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the company with ID: " + id));
        vehicle.setRegistrationNumber(vehicleRequest.getRegistrationNumber());
        return vehicleMapper.map(vehicleRepository.save(vehicle));
    }
}
