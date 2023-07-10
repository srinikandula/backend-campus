package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "auditapproaches")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AuditApproaches extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(max = 30)
    @Column(name = "nameofAuditApproach")
    private String nameofAuditApproach;



    @NotBlank
    @Size(max = 30 )
    @Column(name = "description")
    private String description;

    @NotBlank
    @Size(max = 30)
    @Column(name = "assertions")
    private String assertions;

    @NotBlank
    @Size(max = 30)
    @Column(name = "riskIdentified")
    private String riskIdentified;

    @NotBlank
    @Size(max = 30)
    @Column(name = "toolToolkit")
    private String toolToolkit;

    @NotBlank
    @Size(max = 30)
    @Column(name = "misstatement")
    private String misstatement;

    @NotBlank
    @Size(max = 30)
    @Column(name = "approachGroup")
    private String approachGroup;
}
