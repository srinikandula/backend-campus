package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalTime;

@Entity
@Table(name = "sms_work_updates")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class SmsWorkUpdates extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "updid")
    private Integer updId;

    @Size(max = 11)
    @Column(name = "workid")
    private Integer workId;

    @Size(max = 11)
    @Column(name = "tasklistid")
    private Integer taskListId;

    @Size(max = 1024)
    @Column(name = "description")
    private Integer description;

    @Size(max = 500)
    @Column(name = "usertype")
    private Integer userType;

    @Size(max = 11)
    @Column(name = "userid")
    private Integer userId;

    @Column(name = "insertiondttime")
    private LocalTime insertionDtTime;

    @Size(max = 11)
    @Column(name = "currentstatus")
    private Integer currentStatus;


    @Column(name = "attachment_path")
    private String attachmentPath;

    @Size(max = 250)
    @Column(name = "attachment_id")
    private String attachmentId;

    @Column(name = "check_am", nullable = false, columnDefinition = "int(11)")
    @Comment("1=checked,0=notchecked")
    private Integer checkAm;
}
