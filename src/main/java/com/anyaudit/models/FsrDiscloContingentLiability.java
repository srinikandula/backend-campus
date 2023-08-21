package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "fsr_disclo_contingent_liability")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloContingentLiability extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "particular_id")
    private Integer particularId;

    @Size(max = 255)
    @Column(name = "particular_name")
    private String particularName;

    @Size(max = 255)
    @Column(name = "unit")
    private String unit;

    @Column(name = "date")
    private Date date;

    @Column(name = "previous_year_values", precision = 10, scale = 2)
    private BigDecimal previousYearValues;

    @Column(name = "current_year_values", precision = 10, scale = 2)
    private BigDecimal currentYearValues;

    @Column(name = "input_value", precision = 10, scale = 2)
    private BigDecimal inputValue;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;
}
