package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "fsr_disclo_shareholder_pattern")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloShareholderPattern extends  BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "particular_id")
    private Integer particularId;


    @Size(max = 255)
    @Column(name = "particular_name")
    private String  particularName;

    @Column(name = "current_year_percentage", precision = 10, scale = 2)
    private BigDecimal currentYearPercentage;

    @Column(name = "previous_year_percentage", precision = 10, scale = 2)
    private BigDecimal previousYearPercentage;

    @Column(name = "previous_year_values", precision = 10, scale = 2)
    private BigDecimal previousYearValues;

    @Column(name = "current_year_values", precision = 10, scale = 2)
    private BigDecimal currentYearValues;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;
}
