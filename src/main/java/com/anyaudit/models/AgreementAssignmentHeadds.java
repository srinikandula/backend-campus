package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "agreement_assignment_headds")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgreementAssignmentHeadds extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 11)
    @Column(name = "id")
    private int id;


    @Column(nullable = false, length = 250)
    private String name;

    @Column(nullable = false, columnDefinition = "text")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "agreement_type")
    private EAgreementType agreementType;

    @Size(max = 11)
    @Column(name = "assignment_id",nullable = false)
    private int assignmentId;

    @Size(max = 11)
    @Column(name = "client_id",nullable = false)
    private int clientId;

    @Size(max = 11)
    @Column(name = "domain_id",nullable = false)
    private int domainId;

    @Size(max = 11)
    @Column(name = "borrow_from", nullable = false)
    private int borrowFrom;

}
