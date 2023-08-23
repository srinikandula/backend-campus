package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "agreement_assignment_nodeds")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgreementAssignmentNodeds extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "node_id")
    private Long nodeId;

    @Size(max = 11)
    @Column(name = "parent_nodeid")
    private Integer parentNodeId;

    @Size(max = 11)
    @Column(name = "head_id")
    private Integer headId;

    @Size(max = 250)
    @Column(name = "short")
    private String shorts;

    @Column(name = "full")
    private String full;

    @Column(name = "answer")
    private String answer;

    @Size(max = 11)
    @Column(name = "nodelevel")
    private Integer nodeLevel;

    @Size(max = 80)
    @Column(name = "nodecode")
    private String nodeCode;


    @Size(max = 11)
    @Column(name = "level1")
    private Integer level1;

    @Size(max = 11)
    @Column(name = "level2")
    private Integer level2;


    @Size(max = 11)
    @Column(name = "level3")
    private Integer level3;


    @Size(max = 11)
    @Column(name = "level4")
    private Integer level4;


    @Size(max = 11)
    @Column(name = "level5")
    private Integer level5;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "risk_score", columnDefinition = "double(10,2)")
    private Double riskScore;

    @Column(name = "control_score",columnDefinition = "double(10,2)")
    private Double controlScore;

    @Column(name = "total_score",columnDefinition = "double(10,2)")
    private Double totalScore;

    @Column(name = "open_risk_score",columnDefinition = "double(10,2)")
    private Double openRiskScore;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 11)
    @Column(name = "link_id")
    private Integer linkId;

    @Size(max = 11)
    @Column(name = "control_owner")
    private Integer controlOwner;

    @Size(max = 255)
    @Column(name = "node_code")
    private String nodeCodes;

    @Size(max = 11)
    @Column(name = "node_level")
    private Integer nodeLevels;

    @Size(max = 11)
    @Column(name = "node_sequence")
    private Integer nodeSequence;

}
