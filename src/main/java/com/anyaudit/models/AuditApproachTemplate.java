package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "audit_approach_template",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "template_name")
        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuditApproachTemplate extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "approach_id")
    private Long approachId;


    @Size(max = 250)
    @Column(name = "template_name")
    private String templateName;

    @Size(max = 11)
    @Column(name = "assertion_id")
    private Integer assertionId;

    @Size(max = 11)
    @Column(name = "potential_risk_identified")
    private Integer potentialRiskIdentified;

    @Size(max = 11)
    @Column(name = "potential_misstatement")
    private Integer potentialMisstatement;


    @Column(name = "tool_id", columnDefinition = "int(11) COMMENT 'configurations_type_id'")
    private Integer toolId;

    @Size(max = 11)
    @Column(name = "tool_kit_id")
    private Integer toolKitId;

    @Size(max = 250)
    @Column(name = "tool_kit_name")
    private String toolKitName;


    @Column(name = "audit_approach",columnDefinition = "text")
    private String auditApproach;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "status", columnDefinition = "int(2) default 1")
    private Integer status;
}
