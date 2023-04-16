package org.example.mapper;

import org.example.model.CompanyRequest;
import org.example.model.CompanyResponse;
import org.example.entity.Company;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {

    public CompanyResponse map(Company company);

    public Company map(CompanyRequest companyRequest);
    List<CompanyResponse> map(List<Company> all);

}

