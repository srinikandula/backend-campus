package com.anyaudit.models;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "tasks_team_allocation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TasksTeamAllocation extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "allocationid")
    private Long allocationId;

    @Size(max = 11)
    @Column(name = "workid")
    private Integer workId;

    @Size(max = 11)
    @Column(name = "tasklistid")
    private Integer tasklistId;

    @Size(max = 11)
    @Column(name = "toolsId")
    private Integer toolsId;

    @Size(max = 11)
    @Column(name = "tools_tasklistid")
    private Integer toolsTaskListId;

    @Size(max = 11)
    @Column(name = "doer_userid")
    private Integer doerUserId;

    @Size(max = 11)
    @Column(name = "approver_userid")
    private Integer approverUserId;

    @Size(max = 15)
    @Column(name = "createdusertype")
    private String createdUserType;

    @Column(name = "est_hrs", columnDefinition = "float(5,2)")
    private Float estHrs;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "task_status")
    @Comment("(sms_work_status)1 initiated 2 pending 3 inprogress 4 completed 5 closed")
    private Integer taskStatus;

    @Column(name = "status_change_dt")
    private Date statusChangeDt;

    @Size(max = 50)
    @Column(name = "approver_teamuserrole")
    private String approverTeamUserRole;

    @Size(max = 50)
    @Column(name = "doer_teamuserrole")
    private String doerTeamUserRole;

    @ColumnDefault("1")
    @Column(name = "status")
    @Comment("active=1;inactive=0")
    private Integer status;

    @Size(max = 11)
    @Column(name = "app_hrs")
    private Integer appHrs;

    @Size(max = 11)
    @Column(name = "doer_hrs")
    private Integer doerHrs;

    @Column(name = "startTime")
    private Date startTime;

    @Column(name = "endTime")
    private Date endTime;
}
