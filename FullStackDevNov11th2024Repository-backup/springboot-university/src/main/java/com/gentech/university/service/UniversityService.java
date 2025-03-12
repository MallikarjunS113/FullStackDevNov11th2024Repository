package com.gentech.university.service;

import com.gentech.university.dto.UniversityDto;

import java.util.Date;
import java.util.List;

public interface UniversityService {

    UniversityDto createUniversityEntity(UniversityDto universityDto);

    UniversityDto getUniversityEntity(Integer universityId);

    UniversityDto modifyUniversityEntity(Integer universityId,UniversityDto universityDto);

    List<UniversityDto> getUniversityName(String universityName);
    List<UniversityDto> getUniversityEstablishedDate(Date universityEstablishedDate);
    List<UniversityDto> getUniversityLocation(String universityLocation);
    List<UniversityDto> getUniversityEmail(String universityEmail);
    List<UniversityDto> getUniversityContactNumber(Long universityContactNumber);
    List<UniversityDto> getUniversityRank(Integer universityRank);
}
