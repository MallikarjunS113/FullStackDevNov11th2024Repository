package com.gentech.university.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UniversityDto {

    private Integer universityId;
    private String universityName;
    private Date universityEstablishedDate;
    private String universityLocation;
    private String universityEmail;
    private Long universityContactNumber;
    private Integer universityRank;
    Date createdDate;
    Date updatedDate;
}
