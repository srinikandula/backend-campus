package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Events extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long eventId;

    @Size(max = 250)
    @Column(name = "event_name")
    private String eventName;

    @Column(name = "description",columnDefinition = "text")
    private String description;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "plannedstartdate")
    private Date plannedstartdate;

    @Column(name = "plannedenddate")
    private Date plannedenddate;


    @Size(max = 50)
    @Column(name = "plannedstarttime")
    private String plannedstarttime;

    @Size(max = 50)
    @Column(name = "plannedendtime")
    private String plannedendtime;

    @Size(max = 50)
    @Column(name = "priority")
    private String priority;

    @Size(max = 50)
    @Column(name = "value")
    private String value;

    @Size(max = 11)
    @Column(name = "event_head")
    private Integer eventHead;

    @Column(name = "users",columnDefinition = "text")
    private String users;

    @Size(max = 11)
    @Column(name = "work_id")
    private Integer workId;

    @Size(max = 30)
    @Column(name = "actual_starttime")
    private String actualStarttime;

    @Size(max = 30)
    @Column(name = "actual_endtime")
    private String actualEndtime;


    @Size(max = 11)
    @Column(name = "event_status")
    private Integer eventStatus;


}
