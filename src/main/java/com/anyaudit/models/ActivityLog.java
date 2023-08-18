package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "activity_log")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ActivityLog extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "entered_dt")
    private Date enteredDt;

    @Size(max = 250)
    @Column(name = "activity")
    private String activity;

    @Size(max = 250)
    @Column(name = "info_name")
    private String infoName;

    @Size(max = 11)
    @Column(name = "info_id")
    private Integer infoId;

    @Size(max = 11)
    @Column(name = "entered_user")
    private Integer enteredUser;

    @Column( columnDefinition = "varchar(50) DEFAULT 'notapproved' COMMENT 'approved,notapproved'")
    private String status;

}

