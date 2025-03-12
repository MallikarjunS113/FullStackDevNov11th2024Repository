package com.traini8.trainingcenter.mapper;


import com.traini8.trainingcenter.dto.*;
import com.traini8.trainingcenter.entity.*;
import java.time.Instant;

public class TrainingCenterMapper {
    public static TrainingCenter toEntity(TrainingCenterRequestDto dto) {
        TrainingCenter center = new TrainingCenter();
        center.setCenterName(dto.getCenterName());
        center.setCenterCode(dto.getCenterCode());

        Address address = new Address();
        address.setDetailedAddress(dto.getAddress().getDetailedAddress());
        address.setCity(dto.getAddress().getCity());
        address.setState(dto.getAddress().getState());
        address.setPinCode(dto.getAddress().getPinCode());
        center.setAddress(address);

        center.setStudentCapacity(dto.getStudentCapacity());
        center.setCoursesOffered(dto.getCoursesOffered());
        center.setContactEmail(dto.getContactEmail());
        center.setContactPhone(dto.getContactPhone());
        center.setCreatedOn(Instant.now());
        return center;
    }

    public static TrainingCenterResponseDto toDTO(TrainingCenter entity) {
        TrainingCenterResponseDto dto = new TrainingCenterResponseDto();
        dto.setCenterName(entity.getCenterName());
        dto.setCenterCode(entity.getCenterCode());
        AddressDto addressDTO = new AddressDto();
        addressDTO.setDetailedAddress(entity.getAddress().getDetailedAddress());
        addressDTO.setCity(entity.getAddress().getCity());
        addressDTO.setState(entity.getAddress().getState());
        addressDTO.setPinCode(entity.getAddress().getPinCode());
        dto.setAddress(addressDTO);
        dto.setStudentCapacity(entity.getStudentCapacity());
        dto.setCoursesOffered(entity.getCoursesOffered());
        dto.setContactEmail(entity.getContactEmail());
        dto.setContactPhone(entity.getContactPhone());
        dto.setCreatedOn(entity.getCreatedOn().toEpochMilli());
        return dto;
    }
}

