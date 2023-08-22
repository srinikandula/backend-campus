package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "compliance_calendar_schedule")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComplianceCalendarSchedule extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "question_id")  //Foreign Key : compliance_calendar_questions
    private Integer questionId;

    @Size(max = 11)
    @Column(name = "timeline_id") //Foreign Key : timeline
    private Integer timelineId;

    @Column(name = "is_applicable")// columnDefinition = "DEFAULT '1' COMMENT '1-applicable, 2- not applicable"
    private Integer isApplicable;

    @Column(name = "applicable_day") // columnDefinition = "DEFAULT '1' COMMENT '1- 31 days no allowed'"
    private Integer applicableDay;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Size(max = 11)
    @Column(name = "master_parent_id")
    private Integer masterParentId;

}
