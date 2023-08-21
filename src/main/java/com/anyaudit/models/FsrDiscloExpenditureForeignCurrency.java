package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_disclo_expenditure_foreign_currency")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloExpenditureForeignCurrency extends BaseModel{

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

    @Column(name = "currency")
    private String currency;

    @Column(name = "current_year", columnDefinition = "float(11,2)")
    private Float currentYear;

    @Column(name = "previous_year", columnDefinition = "float(11,2)")
    private Float previousYear;

    @Size(max = 1)
    @Column(name = "status")
    private Integer status;
}
