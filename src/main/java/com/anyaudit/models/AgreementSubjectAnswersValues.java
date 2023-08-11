package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "agreement_subject_answers_values")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgreementSubjectAnswersValues extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 11)
    @Column(name = "value_id" ,nullable = false)
    private int valueId;

    @Size(max = 11)
    @Column(name = "agreement_subject_id" ,nullable = false)
    private int agreementSubjectId;

    @Column(name = "answer", nullable = false)
    private String answer;

    @Size(max = 11)
    @Column(name = "agreement_node_id" ,nullable = false)
    private int agreementNodeId;

    @Size(max = 11)
    @Column(name = "given_by" ,nullable = false)
    private int givenBy;

    @Size(max = 11)
    @Column(name = "execution_id" ,nullable = false)
    private int executionId;

    @Size(max = 11)
    @Column(name = "approver_user" ,nullable = false)
    private int approverUser;

    @Size(max = 11)
    @Column(name = "doer_user" ,nullable = false)
    private int doerUser;

    @Column(name = "given_dt", nullable = false)
    private Date givenDt;

    @Size(max = 11)
    @Column(name = "approved_by" ,nullable = false)
    private int approvedBy;

    @Column(name = "approved_dt", nullable = false)
    private Date approvedDt;

    @Column(name = "yes_no", nullable = false)
    private int yesNo;

    @Column(name = "ans", nullable = false)
    private int ans;

}
