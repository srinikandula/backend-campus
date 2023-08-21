package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
@Entity
@Table(name = "p_risks_mitigants")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PRisksMitigants extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prm_id")
    private Long prm_id;

    @Size(max = 11)
    @Column(name = "assertion_id")
    private Integer assertionId;

    @Size(max = 11)
    @Column(name = "potential_risk_identified")
    private Integer potentialRiskIdentified;

    @Size(max = 11)
    @Column(name = "potential_misstatement")
    private Integer potentialMisstatement;

    @Size(max = 11)
    @Column(name = "fss_risk_id")
    private Integer fssRiskId;

    @Size(max = 11)
    @Column(name = "fss_line_id")
    private Integer fssLineId;

    @Size(max = 11)
    @Column(name = "tool_scheduler_id")
    private Integer toolSchedulerId;

    @Size(max = 11)
    @Column(name = "procedure_id")
    private Integer procedureId;


    @Column(name = "audit_approach")
    private String auditApproach;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 2)
    @Column(name = "status")
    private Integer status;

    @Size(max = 11)
    @Column(name = "doer_id")
    private Integer doerId;

    @Size(max = 11)
    @Column(name = "approver_id")
    private Integer approverId;


}
