package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "agreement_assignment_nodeds")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgreementAssignmentNodeds extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 11)
    @Column(name = "node_id" ,nullable = false)
    private int nodeId;


    @Size(max = 11)
    @Column(name = "parent_nodeid", nullable = false)
    private int parentNodeId;

    @Size(max = 11)
    @Column(name = "head_id", nullable = false)
    private int headId;


    @Column(name = "short", nullable = false)
    private String shorts;

    @Column(name = "full", nullable = false)
    private String full;

    @Column(name = "answer", nullable = false)
    private String answer;

    @Size(max = 11)
    @Column(name = "nodelevel", nullable = false)
    private int nodeLevel;

    @Column(name = "nodecode", nullable = false)
    private String nodeCode;


    @Size(max = 11)
    @Column(name = "level1", nullable = false)
    private int level1;

    @Size(max = 11)
    @Column(name = "level2", nullable = false)
    private int level2;


    @Size(max = 11)
    @Column(name = "level3", nullable = false)
    private int level3;


    @Size(max = 11)
    @Column(name = "level4", nullable = false)
    private int level4;


    @Size(max = 11)
    @Column(name = "level5", nullable = false)
    private int level5;


    @Column(name = "risk_score")
    private Double riskScore;

    @Column(name = "control_score")
    private Double controlScore;

    @Column(name = "total_score")
    private Double totalScore;

    @Column(name = "open_risk_score")
    private Double openRiskScore;

    @Column(name = "client_id", nullable = false)
    private int clientId;

    @Column(name = "assignment_id", nullable = false)
    private int assignmentId;

    @Column(name = "domain_id", nullable = false)
    private int domainId;

    @Column(name = "control_owner", nullable = false)
    private int controlOwner;

    @Column(name = "node_code", length = 255)
    private String nodeCodes;

    @Column(name = "node_level")
    private Integer nodeLevels;

    @Column(name = "node_sequence")
    private Integer nodeSequence;

}
