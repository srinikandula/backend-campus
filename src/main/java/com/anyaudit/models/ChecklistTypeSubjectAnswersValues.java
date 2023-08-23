package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "checklist_type_subject_answers_values")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChecklistTypeSubjectAnswersValues extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "value_id")
    private Long valueId;

    @Size(max = 11)
    @Column(name = "execution_id")
    private Integer executionId;

    @Column(name = "answer")
    private String answer;

    @Size(max = 11)
    @Column(name = "checklist_node_id")
    private Integer checklistNodeId;

    @Size(max = 11)
    @Column(name = "checklist_id")
    private Integer checklistId;

    @Size(max = 11)
    @Column(name = "given_by")
    private Integer givenBy;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;

    @Column(name = "status")
    @Comment("1=not initiated,2-submitted,3-rejected,4-approved")
    private Integer status;

    @Column(name = "given_dt")
    private Date givenDt;

    @Size(max = 11)
    @Column(name = "approved_by")
    private Integer approvedBy;

    @Column(name = "approved_dt")
    private Date approvedDt;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @ColumnDefault("4")
    @Column(name = "yes_no")
    private Integer yesNo;

    @Size(max = 1)
    @Column(name = "ans")
    private Integer ans;

    @Size(max = 50)
    @Column(name = "fav_adv")
    private String favAdv;

    @Size(max = 1)
    @Column(name = "rule_status")
    private Integer ruleStatus;
}
