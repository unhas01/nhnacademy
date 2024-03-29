package com.nhnacademy.jpa.repository.birthDeathReportResident;

import com.nhnacademy.jpa.dto.birthDeathReportResident.BirthDeathReportDto;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BirthDeathRepostRepositoryCustom {

    BirthDeathReportDto getBirthReport(Long serialNumber, String birthDeathCode);
}
