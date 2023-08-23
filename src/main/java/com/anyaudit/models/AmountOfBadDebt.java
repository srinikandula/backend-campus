package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "amount_of_bad_debt")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AmountOfBadDebt extends BaseModel {

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

    @Column(name = "name_of_the_party", length = 255)
    private String nameOfTheParty;

    @Column(name = "total_recievable", length = 255)
    private String totalReceivable;

    @Column(name = "provision_available", length = 255)
    private String provisionAvailable;

    @Column(name = "write_off_during_year", length = 255)
    private String writeOffDuringYear;

    @Column(name = "security_available", length = 255)
    private String securityAvailable;

    @Size(max = 11)
    @Column(name = "attachment")
    private Integer attachment;


    @Column(name = "status",columnDefinition = "INT DEFAULT 1")
    private Integer status;


}
