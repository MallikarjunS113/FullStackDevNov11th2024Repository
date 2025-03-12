package com.traini8.trainingcenter.controller;


import com.traini8.trainingcenter.dto.TrainingCenterRequestDto;
import com.traini8.trainingcenter.dto.TrainingCenterResponseDto;
import com.traini8.trainingcenter.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

   private final TrainingCenterService service;
   public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }


    @PostMapping("/createtrainingcenter")
    public ResponseEntity<TrainingCenterResponseDto> create(@Valid @RequestBody TrainingCenterRequestDto dto) {
        return new ResponseEntity<>(service.createTrainingCenter(dto),HttpStatus.OK);
    }

    @GetMapping("/alltrainingcenter")
    public ResponseEntity<List<TrainingCenterResponseDto>> getAll() {
        return new ResponseEntity<>(service.getAllTrainingCenters(),HttpStatus.OK);
    }
}
