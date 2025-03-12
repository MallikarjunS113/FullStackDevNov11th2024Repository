package com.gentech.university.serviceImplimentation;

import com.gentech.university.dto.UniversityDto;
import com.gentech.university.entity.UniversityEntity;
import com.gentech.university.mapper.UniversityMapper;
import com.gentech.university.repository.UniversityRepository;
import com.gentech.university.service.UniversityService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UniversityServiceImplementation implements UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public UniversityDto createUniversityEntity(UniversityDto universityDto) {
        UniversityEntity universityEntity= UniversityMapper.mapToUniversityEntity(universityDto);
        UniversityEntity savedUniversityEntity=universityRepository.save(universityEntity);
        return UniversityMapper.mapToUniversityDto(savedUniversityEntity);
    }

    @Override
    public UniversityDto getUniversityEntity(Integer universityId) {
        UniversityEntity universityEntity=universityRepository.findById(universityId).orElseThrow(()->
                new RuntimeException("The University With id "+universityId+" has not found in the database!!!"));
        return UniversityMapper.mapToUniversityDto(universityEntity);
    }

    @Override
    public UniversityDto modifyUniversityEntity(Integer universityId, UniversityDto universityDto) {

        UniversityEntity universityEntity=universityRepository.findById(universityId).orElseThrow(() ->
                new RuntimeException("The University With id "+universityId+" has not found in the database!!!"));
        universityEntity.setUniversityId(universityId);
        universityEntity.setUniversityEmail(universityDto.getUniversityEmail());
        universityEntity.setUniversityLocation(universityDto.getUniversityLocation());
        universityEntity.setUniversityName(universityDto.getUniversityName());
        universityEntity.setUniversityRank(universityDto.getUniversityRank());
        universityEntity.setUniversityContactNumber(universityDto.getUniversityContactNumber());

        return UniversityMapper.mapToUniversityDto(universityRepository.save(universityEntity));
    }

    @Override
    public List<UniversityDto> getUniversityName(String universityName) {
        return universityRepository.findByName(universityName).stream()
                .map(universityEntity )->
    }

    @Override
    public List<UniversityDto> getUniversityEstablishedDate(Date universityEstablishedDate) {
        return List.of();
    }

    @Override
    public List<UniversityDto> getUniversityLocation(String universityLocation) {
        return List.of();
    }

    @Override
    public List<UniversityDto> getUniversityEmail(String universityEmail) {
        return List.of();
    }

    @Override
    public List<UniversityDto> getUniversityContactNumber(Long universityContactNumber) {
        return List.of();
    }

    @Override
    public List<UniversityDto> getUniversityRank(Integer universityRank) {
        return List.of();
    }

}
