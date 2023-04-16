package org.example.mapper;

import org.example.entity.TechnicalInfo;
import org.example.model.TechnicalInfoRequest;
import org.example.model.TechnicalInfoResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TechnicalInfoMapper {

    TechnicalInfoResponse map(TechnicalInfo technicalInfo);

    TechnicalInfo map(TechnicalInfoRequest technicalInfoRequest);

    List<TechnicalInfoResponse> map(List<TechnicalInfo> all);
}
