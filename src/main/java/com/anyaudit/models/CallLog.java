package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "calllog", indexes = {
        @Index(name = "uindex", columnList = "appuserid"),
        @Index(name = "clindexenti", columnList = "clientid"),
        @Index(name = "taskindex", columnList = "taskid"),
        @Index(name = "clientid_index", columnList = "clientid")

})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CallLog extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "logid")
    private Long logId;

    @Column(name = "appuserid")
    private Integer appuserId;

    @Column(name = "clientid")
    private Integer clientId;

    @Column(name = "taskid")
    private Integer taskId;

    @Column(name = "milestoneid")
    private Integer milestoneId;

    @Column(name = "contactname")
    private String contactName;

    @Column(name = "contactnumber")
    private Integer contactNumber;

    @Column(name = "calldate")
    private Date callDate;

    @Column(name = "calltime")
    private Time callTime;

    @Column(name = "callcontent")
    private String callContent;

    @Column(name = "typeofcall")
    private String typeOfCall;

    @Column(name = "taggedusers")
    private String taggedUsers;

    @Column(name = "tododate")
    private Date todoDate;

    @Column(name = "todotime")
    private Time todoTime;

    @Column(name = "todotask")
    private String todoTask;

    @Column(name = "voiceattachment_path")
    private String voiceAttachmentPath;

    @Column(name = "entereddt")
    private Date enterEddt;

    @Column(name = "referredby")
    private Integer referredBy;

    @Column(name = "sendsms", columnDefinition = "varchar(3) NOT NULL DEFAULT 'no' COMMENT 'yes,no'")
    private String sendSms;

    @Column(name = "status", columnDefinition = "varchar(30) NOT NULL DEFAULT 'active' COMMENT 'active,archive'")
    private String status;

    @Column(name = "domain")
    private Integer domain;
}
