package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.VehicleRequest;
import org.example.model.VehicleResponse;
import org.example.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicle")
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService vehicleService;

    @GetMapping
    public List<VehicleResponse> findAll(){
        return vehicleService.findAll();
    }

    @GetMapping("{id}")
    public VehicleResponse findById(@PathVariable Integer id){
        return vehicleService.findById(id);
    }

    @PostMapping
    public VehicleResponse save(@RequestBody VehicleRequest vehicleRequest){
        return vehicleService.save(vehicleRequest);
    }

    @GetMapping("search/{registrationNumber}")
    public List<VehicleResponse> findByName(@PathVariable("registrationNumber") String registrationNumber) {
        return vehicleService.findByRegistrationNumber(registrationNumber);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        vehicleService.deleteById(id);
    }


    @PatchMapping("{id}")
    public VehicleResponse updateById(@RequestBody VehicleRequest vehicleRequest,
                                      @PathVariable("id") Integer id) {
        return vehicleService.updateById(vehicleRequest, id);
    }
}
