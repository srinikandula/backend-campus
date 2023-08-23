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
@Table(name = "sms_workupdates_clearance")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SmsWorkUpdatesClearance extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clearanceid")
    private Long clearanceId;

    @Size(max = 11)
    @Column(name = "workupdate_id")
    private Integer workUpdateId;

    @Size(max = 11)
    @Column(name = "clearanceuser")
    private Integer clearanceUser;

    @Size(max = 25)
    @Column(name = "usertype")
    private String userType;

    @Column(name = "clearancestatus")
    @Comment("0-Not seen,1-seen")
    private Integer clearanceStatus;

    @Column(name = "clearancetime")
    private Date clearanceTime;
}
