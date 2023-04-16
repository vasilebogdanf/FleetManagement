package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.entity.TechnicalInfo;
import org.example.exception.BusinessException;
import org.example.mapper.TechnicalInfoMapper;
import org.example.model.TechnicalInfoRequest;
import org.example.model.TechnicalInfoResponse;
import org.example.repository.TechnicalInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechinicalInfoService {

    private final TechnicalInfoRepository technicalInfoRepository;
    private final TechnicalInfoMapper technicalInfoMapper;


    public List<TechnicalInfoResponse> findAll() {
        return technicalInfoMapper.map(technicalInfoRepository.findAll());
    }

    public TechnicalInfoResponse findById(Integer id) {
        TechnicalInfo technicalInfo = technicalInfoRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the technicalInfo with ID: " + id));
        return technicalInfoMapper.map(technicalInfo);

    }

    public TechnicalInfoResponse save(TechnicalInfoRequest technicalInfoRequest) {
        TechnicalInfo technicalInfo = technicalInfoMapper.map(technicalInfoRequest);
        return technicalInfoMapper.map(technicalInfoRepository.save(technicalInfo));
    }

    public List<TechnicalInfoResponse> findByBrand(String brand) {
        List<TechnicalInfo> byName = technicalInfoRepository.findByBrand(brand);
        return technicalInfoMapper.map(byName);
    }

    public void deleteById(Integer id) {
        TechnicalInfo technicalInfo = technicalInfoRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find with technicalInfo with Id " + id));
        technicalInfoRepository.deleteById(technicalInfo.getId());
    }

    public TechnicalInfoResponse updateBrandById(TechnicalInfoRequest technicalInfoRequest, Integer id) {
        TechnicalInfo technicalInfo = technicalInfoRepository.findById(id).orElseThrow(()
                -> new BusinessException("Cannot find the technicalInfo with ID: " + id));
        technicalInfo.setBrand(technicalInfoRequest.getBrand());
        return technicalInfoMapper.map(technicalInfoRepository.save(technicalInfo));
    }
}
