package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.Company;
import org.example.exception.BusinessException;
import org.example.mapper.CompanyMapper;
import org.example.model.CompanyRequest;
import org.example.model.CompanyResponse;
import org.example.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    public List<CompanyResponse> findAll() {
        return companyMapper.map(companyRepository.findAll());
    }
    public CompanyResponse save(CompanyRequest companyRequest) {
        Company company = companyMapper.map(companyRequest);
        return companyMapper.map(companyRepository.save(company));
    }
    public CompanyResponse findById(Integer id) {
        Company company = companyRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the company with ID: " + id));
        return companyMapper.map(company);
    }

    public void deleteById(Integer id) {
        Company company = companyRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find with Id " + id));
        companyRepository.deleteById(company.getId());
    }

    public List<CompanyResponse> findByName(String name) {
        List<Company> byName = companyRepository.findByName(name);
        return companyMapper.map(byName);
    }

    public CompanyResponse updateById(CompanyRequest companyRequest,Integer id) {
        Company company=companyRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the company with ID: " + id));
        company.setName(companyRequest.getName());
      return companyMapper.map(companyRepository.save(company));
    }
}
