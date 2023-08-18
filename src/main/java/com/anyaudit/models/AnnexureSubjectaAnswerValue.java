package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "annexure_subject_answer_value")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AnnexureSubjectaAnswerValue extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "aname")
    private String aname;

    @Size(max = 11)
    @Column(name = "N1")
    private Integer n1;

    @Size(max = 11)
    @Column(name = "N2")
    private Integer n2;

    @Size(max = 11)
    @Column(name = "N3")
    private Integer n3;

    @Size(max = 11)
    @Column(name = "N4")
    private Integer n4;

    @Size(max = 11)
    @Column(name = "N5")
    private Integer n5;

    @Size(max = 250)
    @Column(name = "V1")
    private String v1;

    @Size(max = 250)
    @Column(name = "V2")
    private String V2;

    @Size(max = 250)
    @Column(name = "V3")
    private String v3;

    @Size(max = 250)
    @Column(name = "V4")
    private String v4;

    @Size(max = 250)
    @Column(name = "V5")
    private String v5;


    @Column(name = "D1")
    private Date d1;

    @Column(name = "D2")
    private Date d2;

    @Column(name = "D3")
    private Date d3;

    @Column(name = "D4")
    private Date d4;

    @Column(name = "D5")
    private Date d5;

    @Column(name = "F1", precision = 15, scale = 2)
    private Double f1;

    @Column(name = "F2", precision = 15, scale = 2)
    private Double f2;

    @Column(name = "F3", precision = 15, scale = 2)
    private Double f3;

    @Column(name = "F4", precision = 15, scale = 2)
    private Double f4;

    @Column(name = "F5", precision = 15, scale = 2)
    private Double f5;


    @Column(name = "T1")
    private Integer t1;

    @Column(name = "T2")
    private Integer t2;

    @Column(name = "T3")
    private Integer t3;

    @Column(name = "T4")
    private Integer t4;

    @Column(name = "T5")
    private Integer t5;

    @Size(max = 250)
    @Column(name = "col6")
    private String col6;

    @Size(max = 250)
    @Column(name = "col7")
    private String col7;

    @Size(max = 250)
    @Column(name = "col8")
    private String col8;

    @Size(max = 250)
    @Column(name = "col9")
    private String col9;

    @Size(max = 250)
    @Column(name = "col10")
    private String col10;

    @Size(max = 250)
    @Column(name = "col11")
    private String col11;


    @Size(max = 250)
    @Column(name = "col12")
    private String col12;

    @Size(max = 250)
    @Column(name = "col13")
    private String col13;

    @Size(max = 250)
    @Column(name = "col4")
    private String col14;

    @Size(max = 250)
    @Column(name = "col15")
    private String col15;

    @Size(max = 11)
    @Column(name = "clientid")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignmentid")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "domainid")
    private Integer domainId;

    @Size(max = 11)
    @Column(name = "elementid")
    private Integer elementId;

    @Size(max = 11)
    @Column(name = "subjectid")
    private Integer subjectId;

    @Size(max = 11)
    @Column(name = "annexureid")
    private Integer annexureId;

    @Size(max = 11)
    @Column(name = "execution_id")
    private String executionId;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;


    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;

    @Column(name = "approve", columnDefinition = "int(11) NOT NULL COMMENT '1=approve,0=notapproved'")
    private Integer approve;

    @Size(max = 11)
    @Column(name = "approved_by")
    private Integer approvedBy;

    @Size(max = 11)
    @Column(name = "approved_on")
    private Date approvedOn;

    @Column(name = "status", columnDefinition = "int(11) NOT NULL COMMENT '1=not initiated,2-submitted,3-rejected,4-approved'")
    private Integer status;



}
