package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sms_works_ec_permissions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SmsWorksEcPermissions extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perid")
    private Long perId;

    @Size(max = 11)
    @Column(name = "workid")
    private Integer workId;

    @Size(max = 50)
    @Column(name = "createdusertype")
    private String createdUserType;

    @Size(max = 11)
    @Column(name = "userid")
    private Integer userId;

    @Size(max = 25)
    @Column(name = "usertype")
    private String userType;

    @Column(name = "userstatus", nullable = false, columnDefinition = "varchar(15) default 'active' comment 'active,inactive'")
    private String userStatus;

    @Size(max = 11)
    @Column(name = "estime_hrs")
    private String esTimeHrs;

    @Size(max = 11)
    @Column(name = "equiv_perc")
    private String eQuivPerc;
}
