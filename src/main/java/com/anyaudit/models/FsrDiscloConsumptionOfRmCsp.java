package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_disclo_consumption_of_rmcsp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloConsumptionOfRmCsp extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;


    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "particulars")
    private String particulars;

    @Column(name = "perc_current_year", columnDefinition = "float(11,2)")
    private Float percCurrentYear;

    @Column(name = "value_current_year", columnDefinition = "float(11,2)")
    private Float valueCurrentYear;

    @Column(name = "perc_previous_year", columnDefinition = "float(11,2)")
    private Float percPreviousYear;

    @Column(name = "value_previous_year", columnDefinition = "float(11,2)")
    private Float valuePreviousYear;

    @Column(name = "status", columnDefinition = "TINYINT(1)")
    private Integer status;
}
