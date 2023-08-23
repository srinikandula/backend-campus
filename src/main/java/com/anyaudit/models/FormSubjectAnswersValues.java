package com.anyaudit.models;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "form_subject_answers_values",
        indexes = {
                @Index(name = "execution_id_index", columnList = "execution_id,approver_user,doer_user")

        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FormSubjectAnswersValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "value_id")
    private Long valueId;

    @Size(max = 11)
    @Column(name = "form_subject_id")
    private Integer form_subjectId;

    @Column(name = "answer")
    private String answer;

    @Size(max = 11)
    @Column(name = "checklist_node_id")
    private Integer checklistNodeId;

    @Size(max = 11)
    @Column(name = "given_by")
    private Integer givenBy;

    @Size(max = 11)
    @Column(name = "execution_id")
    private Integer executionId;

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

    @ColumnDefault("2")
    @Column(name = "yes_no")
    private Integer yesNo;

    @Size(max = 1)
    @Column(name = "ans")
    private Integer ans;

    @Size(max = 50)
    @Column(name = "fav_adv")
    private String favAdv;

    @ColumnDefault("1")
    @Column(name = "rule_status")
    private Integer ruleStatus;

    @Column(name = "short_form")
    private String shortForm;

    @Column(name = "full_form")
    private String fullForm;
}
