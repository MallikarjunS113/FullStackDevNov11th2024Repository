package com.traini8.trainingcenter.service;




import com.traini8.trainingcenter.dto.*;
import java.util.List;

public interface TrainingCenterService {
    TrainingCenterResponseDto createTrainingCenter(TrainingCenterRequestDto request);
    List<TrainingCenterResponseDto> getAllTrainingCenters();
}

