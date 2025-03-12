package com.gentech.university.mapper;

import com.gentech.university.dto.UniversityDto;
import com.gentech.university.entity.UniversityEntity;

public class UniversityMapper {

    public static UniversityDto mapToUniversityDto(UniversityEntity universityEntity)
    {
        UniversityDto universityDto= new UniversityDto(
                universityEntity.getUniversityId(),
                universityEntity.getUniversityName(),
                universityEntity.getUniversityEstablishedDate(),
                universityEntity.getUniversityLocation(),
                universityEntity.getUniversityEmail(),
                universityEntity.getUniversityContactNumber(),
                universityEntity.getUniversityRank(),
                universityEntity.getCreatedDate(),
                universityEntity.getUpdatedDate()
        );
        return universityDto;
    }

    public static UniversityEntity mapToUniversityEntity(UniversityDto universityDto)
    {
        UniversityEntity universityEntity = new UniversityEntity(
                universityDto.getUniversityId(),
                universityDto.getUniversityName(),
                universityDto.getUniversityEstablishedDate(),
                universityDto.getUniversityLocation(),
                universityDto.getUniversityEmail(),
                universityDto.getUniversityContactNumber(),
                universityDto.getUniversityRank(),
                universityDto.getCreatedDate(),
                universityDto.getUpdatedDate()
        );
        return universityEntity;
    }
}

