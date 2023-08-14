package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "sms_works", indexes = {
        @Index(name = "status_index", columnList = "status"),
        @Index(name = "client_id_index", columnList = "client_id"),
        @Index(name = "domain_index", columnList = "domain"),
        @Index(name = "is_fss_index", columnList = "is_fss")
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SmsWorks extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id")
    private int workId;

    @Size(max = 5)
    @Column(name = "workseries", nullable = false)
    private String workSeries;

    @Size(max = 11)
    @Column(name = "client_id", nullable = false)
    private int client;

    @Size(max = 11)
    @Column(name = "period_id", nullable = false)
    private int period;

    @Column(name = "timeline_id", nullable = false, columnDefinition = "int default 0")
    private int timelineId;

    @Size(max = 100)
    @Column(name = "worktaskname", nullable = false)
    private String workTaskName;

    @Size(max = 11)
    @JoinColumn(name = "category_id", nullable = false)
    private int category;

    @Size(max = 11)
    @JoinColumn(name = "workstatus_id", nullable = false)
    private int workStatus;


    @Column(name = "workclosed_description", nullable = false)
    private String workClosedDescription;

    @Size(max = 15)
    @Column(name = "status", nullable = false)
    private String status;

    @Size(max = 25)
    @Column(name = "worktype")
    private String workType;


    @Size(max = 11)
    @Column(name = "taskHead_id", nullable = false)
    private int taskHead;

    @Size(max = 11)
    @Column(name = "task_structure_type", nullable = false)
    private int taskStructureType;

    @Size(max = 11)
    @Column(name = "task_structure_id", nullable = false)
    private int taskStructureId;

    @Column(name = "works_creation_dt", nullable = false)
    private Date worksCreationDt;

    @Column(name = "plannedstartdate", nullable = false)
    private Date plannedStartDate;

    @Column(name = "plannedenddate", nullable = false)
    private Date plannedEndDate;

    @Column(name = "actualstartdate", nullable = false)
    private Date actualStartDate;

    @Column(name = "actualenddate", nullable = false)
    private Date actualEndDate;

    @Size(max = 50)
    @Column(name = "value")
    private String value;

    @Size(max = 15)
    @Column(name = "priority")
    private String priority;

    @Column(name = "description")
    private String description;

    @Size(max = 11)
    @Column(name = "am_id", nullable = false)
    private int amId;

    @Size(max = 11)
    @Column(name = "ru_id", nullable = false)
    private int ruId;

    @Size(max = 11)
    @Column(name = "fss_head_id", nullable = false)
    private int fssHeadId;

    @Size(max = 11)
    @Column(name = "coa_head_id", nullable = false)
    private int coaHeadId;

    @Size(max = 11)
    @Column(name = "cos_head_id", nullable = false)
    private int cosHeadId;

    @Size(max = 11)
    @Column(name = "prev_assignment", nullable = false)
    private int prevAssignment;

    @Size(max = 11)
    @Column(name = "domain", nullable = false)
    private int domain;

    @Size(max = 11)
    @Column(name = "branch_id", nullable = false)
    private int branchId;

    @Size(max = 5)
    @Column(name = "assignment_type", nullable = false)
    private int assignmentType;

    @Size(max = 10)
    @Column(name = "sum_planned_hrs", nullable = false)
    private double sumPlannedHrs;

    @Size(max = 5)
    @Column(name = "sum_performed_hrs", nullable = false)
    private double sumPerformedHrs;

    @Size(max = 5)
    @Column(name = "sum_planned_value", nullable = false)
    private double sumPlannedValue;

    @Size(max = 5)
    @Column(name = "sum_performance_value", nullable = false)
    private double sumPerformanceValue;

    @Size(max = 5)
    @Column(name = "sum_score", nullable = false)
    private double sumScore;

    @Size(max = 5)
    @Column(name = "sum_dur_hrs", nullable = false)
    private double sumDurHrs;

    @Size(max = 5)
    @Column(name = "sum_value", nullable = false)
    private double sumValue;

    @Size(max = 1)
    @Column(name = "financial_series", nullable = false)
    private int financialSeries;

    @Size(max = 1)
    @Column(name = "datacollection_analytics", nullable = false)
    private int dataCollectionAnalytics;

    @Size(max = 1)
    @Column(name = "internal_control_testing", nullable = false)
    private int internalControlTesting;

    @Size(max = 1)
    @Column(name = "automated_ledger_scrutiny", nullable = false)
    private int automatedLedgerScrutiny;

    @Size(max = 11)
    @Column(name = "permanant_current_file", nullable = false)
    private int permanantCurrentFile;

    @Size(max = 1)
    @Column(name = "module_1", nullable = false)
    private int module1;

    @Size(max = 1)
    @Column(name = "module_2", nullable = false)
    private int module2;

    @Size(max = 1)
    @Column(name = "module_3", nullable = false)
    private int module3;

    @Size(max = 1)
    @Column(name = "module_4", nullable = false)
    private int module4;

    @Size(max = 1)
    @Column(name = "module_5", nullable = false)
    private int module5;

    @Size(max = 1)
    @Column(name = "module_6", nullable = false)
    private int module6;

    @Size(max = 1)
    @Column(name = "is_group", nullable = false)
    private int isGroup;

    @Size(max = 11)
    @Column(name = "group_id", nullable = false)
    private int groupId;

    @Size(max = 2)
    @Column(name = "group_sequence", nullable = false)
    private int groupSequence;


    @Size(max = 11)
    @Column(name = "assignment_type_id", nullable = false)
    private int assignmentTypeId;

    @Size(max = 2)
    @Column(name = "custom_type", nullable = false)
    private int customType;

    @Size(max = 1)
    @Column(name = "is_consolidated", nullable = false)
    private int isConsolidated;

    @Size(max = 1)
    @Column(name = "is_fss", nullable = false)
    private int isFss;

}
