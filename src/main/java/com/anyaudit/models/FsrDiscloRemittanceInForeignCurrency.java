package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_disclo_remittance_in_foreign_currency")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloRemittanceInForeignCurrency extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Column(name = "particulars")
    private String particulars;

    @Column(name = "amount_in_current_year", columnDefinition = "FLOAT(11,2)")
    private Float amountInCurrentYear;

    @Column(name = "amount_in_previous_year", columnDefinition = "FLOAT(11,2)")
    private Float amountInPreviousYear;

    @Column(name = "status" ,columnDefinition = "tinyint(1)")
    private Integer status;
}
