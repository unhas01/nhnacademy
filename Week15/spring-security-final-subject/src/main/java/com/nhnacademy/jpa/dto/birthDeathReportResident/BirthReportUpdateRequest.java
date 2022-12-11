package com.nhnacademy.jpa.dto.birthDeathReportResident;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BirthReportUpdateRequest {
    private Date birthDeathReportDate;
    private String emailAddress;
    private String phoneNumber;
}
