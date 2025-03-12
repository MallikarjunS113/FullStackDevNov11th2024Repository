package com.gentech.university.repository;

import com.gentech.university.entity.UniversityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface UniversityRepository extends JpaRepository<UniversityEntity, Integer> {


//    List<UniversityEntity> findById(Integer universityId);

    List<UniversityEntity> findByName(String universityName);

    List<UniversityEntity> findByEstablishedDate(Date universityEstablishedDate);

    List<UniversityEntity> findByLocation(String universityLocation);

    List<UniversityEntity> findByEmail(String universityEmail);

    List<UniversityEntity> findByContactNumber(Long universityContactNumber);

    List<UniversityEntity> findByRank(Integer universityRank);


}
