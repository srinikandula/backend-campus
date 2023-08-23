package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "compliance_calendar_questions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComplianceCalendarQuestions extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qid")
    private Long qid;

    @Column(name = "q_short", length = 250)
    private String qShort;

    @Column(name = "q_long", columnDefinition = "text")
    private String qLong;

    @Size(max = 11)
    @Column(name = "report_id")
    private Integer reportId;

    @Column(name = "status", length = 10)
    private String status;

    @Size(max = 11)
    @Column(name = "sync_id")
    private Integer syncId;

    @Column(name = "sync_on")
    private LocalDateTime syncOn;

    @Size(max = 11)
    @Column(name = "periodicity")
    private Integer periodicity;

    @Column(name = "res_non_compilance", length = 250)
    private String resNonCompliance;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Size(max = 11)
    @Column(name = "master_parent_id")
    private Integer masterParentId;

    @Column(name = "recurring_month", length = 100)
    private String recurringMonth;

    @Size(max = 11)
    @Column(name = "recurring_month_day")
    private Integer recurringMonthDay;



}
