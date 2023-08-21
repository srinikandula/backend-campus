package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fsr_disclo_leases")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDiscloLeases extends BaseModel{
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

    @Size(max = 11)
    @Column(name = "particulars_id")
    private Integer particularsId;

    @Column(name = "amount_in_previous_year")
    private String amountInPreviousYear;

    @Column(name = "amount_in_current_year")
    private String amountInCurrentYear;

    @Size(max = 1)
    @Column(name = "status")
    private Integer status;
}
