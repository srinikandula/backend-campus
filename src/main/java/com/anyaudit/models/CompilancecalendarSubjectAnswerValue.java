package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "compilancecalendar_subject_answer_value")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompilancecalendarSubjectAnswerValue extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "value_id")
    private Long valueId;

    @Size(max = 11)
    @Column(name = "compilancecalendar_id")
    private Integer compilanceCalendarId;

    @Size(max = 11)
    @Column(name = "compilancecalendar_category_id")
    private Integer compilanceCalendarCategoryId;

    @Size(max = 11)
    @Column(name = "compilancecalendar_subcategory_id")
    private Integer compilanceCalendarSubcategoryId;

    @Column(name = "answer",  columnDefinition = "text")
    private String answer;

    @Column(name = "ans_val",columnDefinition = "int")
    private Integer ansVal;


    @Size(max = 11)
    @Column(name = "given_by")
    private Integer givenBy;

    @Size(max = 11)
    @Column(name = "execution_id")
    private Integer executionId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "template_id")
    private Integer templateId;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;


    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "ENUM('NOT_INITIATED', 'SUBMITTED', 'REJECTED', 'APPROVED')")
    private StatusEnum status;

    @Column(name = "given_dt")
    private Date givenDt;

    @Size(max = 11)
    @Column(name = "approved_by")
    private Integer approvedBy;

    @Column(name = "approved_dt")
    private LocalDate approvedDate;

    @Column(name = "actual_date")
    private LocalDate actualDate;

    @Column(name = "compiled_by", length = 250)
    private String compiledBy;

    @Column(name = "proof", length = 250)
    private String proof;

    @Column(name = "remarks", columnDefinition = "TEXT")
    private String remarks;

    @Column(name = "is_applicable", columnDefinition = "TINYINT(4) DEFAULT '1'")
    private boolean isApplicable;

    @Size(max = 11)
    @Column(name = "applicable_day")
    private Integer applicableDay;

    @Column(name = "applicable_date")
    private LocalDate applicableDate;

    @Size(max = 11)
    @Column(name = "timeline_id")
    private Integer timelineId;

    public enum StatusEnum {
        NOT_INITIATED,
        SUBMITTED,
        REJECTED,
        APPROVED
    }
}
