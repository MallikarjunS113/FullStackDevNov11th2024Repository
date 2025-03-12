package com.traini8.trainingcenter.serviceImp;


import com.traini8.trainingcenter.dto.TrainingCenterRequestDto;
import com.traini8.trainingcenter.dto.TrainingCenterResponseDto;
import com.traini8.trainingcenter.entity.TrainingCenter;
import com.traini8.trainingcenter.mapper.TrainingCenterMapper;
import com.traini8.trainingcenter.repository.TrainingCenterRepository;
import com.traini8.trainingcenter.service.TrainingCenterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService {

    private final TrainingCenterRepository repository;

    public TrainingCenterServiceImpl(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    @Override
    public TrainingCenterResponseDto createTrainingCenter(TrainingCenterRequestDto request) {
        TrainingCenter entity = TrainingCenterMapper.toEntity(request);
        TrainingCenter saved = repository.save(entity);
        return TrainingCenterMapper.toDTO(saved);
    }

    @Override
    public List<TrainingCenterResponseDto> getAllTrainingCenters() {
        return repository.findAll().stream().map(TrainingCenterMapper::toDTO).collect(Collectors.toList());
    }

}