package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "todo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Todo extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private Long todoId;

    @Column(name = "plan_date")
    private Date planDate;

    @Column(name = "original_plandate")
    private Date originalPlandate;

    @Size(max = 30)
    @Column(name = "plan_start_time")
    private String planStartTime;

    @Size(max = 30)
    @Column(name = "plan_end_time")
    private String planEndTime;

    @Size(max = 30)
    @Column(name = "actual_start_time")
    private String actualStartTime;

    @Size(max = 30)
    @Column(name = "actual_end_time")
    private String actualEndTime;

    @Column(name = "remarks")
    private String remarks;

    @Size(max = 11)
    @Column(name = "category")
    private Integer category;

    @Size(max = 250)
    @Column(name = "urgency")
    private String urgency;

    @Column(name = "due_date")
    private Date dueDate;

    @Size(max = 11)
    @Column(name = "client")
    private Integer client;

    @Size(max = 11)
    @Column(name = "assignment")
    private Integer assignment;

    @Size(max = 11)
    @Column(name = "planid")
    private Integer planId;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "status")
    @Comment("0=pending,1=postpone,2=closed")
    private Integer status;

    @Column(name = "postpone_on")
    private Date postponeOn;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domaIn;
}
