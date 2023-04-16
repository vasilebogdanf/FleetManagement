package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.CompanyRequest;
import org.example.model.CompanyResponse;
import org.example.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping
    public List<CompanyResponse> findAll() {
        return companyService.findAll();
    }

    @GetMapping("{id}")
    public CompanyResponse findById(@PathVariable("id") Integer id) {
        return companyService.findById(id);
    }

    @PostMapping
    public CompanyResponse save(@RequestBody CompanyRequest companyRequest) {

        return companyService.save(companyRequest);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        companyService.deleteById(id);
    }

    @GetMapping("search/{name}")
    public List<CompanyResponse> findByName(@PathVariable("name") String name) {
        return companyService.findByName(name);
    }

    @PatchMapping("{id}")
    public CompanyResponse updateById( @RequestBody CompanyRequest companyRequest, @PathVariable("id") Integer id) {
        return companyService.updateById(companyRequest,id);
    }
}