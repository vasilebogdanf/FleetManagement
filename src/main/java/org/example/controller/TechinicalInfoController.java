package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.TechnicalInfoRequest;
import org.example.model.TechnicalInfoResponse;
import org.example.service.TechinicalInfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("technicalInfo")
@RequiredArgsConstructor
public class TechinicalInfoController {

    private final TechinicalInfoService techinicalInfoService;

    @GetMapping
    public List<TechnicalInfoResponse>  findAll(){
        return techinicalInfoService.findAll();
    }

    @GetMapping("{id}")
    public TechnicalInfoResponse findById(@PathVariable Integer id){
        return techinicalInfoService.findById(id);
    }

    @PostMapping
    public TechnicalInfoResponse save(@RequestBody TechnicalInfoRequest technicalInfoRequest){
        return techinicalInfoService.save(technicalInfoRequest);
    }

    @GetMapping("search/{name}")
    public List<TechnicalInfoResponse> findByName(@PathVariable("name") String name) {
        return techinicalInfoService.findByBrand(name);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        techinicalInfoService.deleteById(id);
    }

    @PatchMapping("{id}")
    public TechnicalInfoResponse updateBrandById(@RequestBody TechnicalInfoRequest technicalInfoRequest, @PathVariable("id") Integer id) {
        return techinicalInfoService.updateBrandById(technicalInfoRequest,id);
    }

}
