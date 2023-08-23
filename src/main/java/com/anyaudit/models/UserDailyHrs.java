package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "user_daily_hrs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDailyHrs extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "day")
    private Date day;

    @Column(name = "first_log_in_time")
    private LocalTime firstLogInTime;

    @Column(name = "first_log_off_time")
    private LocalTime firstLogOffTime;

    @Column(name = "first_duration")
    private Double firstDuration;

    @Column(name = "second_log_in_time")
    private LocalTime SecondLogInTime;

    @Column(name = "second_log_off_time")
    private LocalTime secondLogOfftime;

    @Column(name = "day_status", columnDefinition = "int(11)")
    @Comment("0-created,1-submitted,2-Rejected,3-Approved")
    private Integer dayStatus;

    @Column(name = "reject_note")
    private String rejectNote;

    @Column(name = "day_note")
    private String dayNote;

    @Column(name = "day_note2")
    private String dayNote2;

    @Column(name = "login_approval", columnDefinition = "int(11)")
    @Comment("0-not approved,1- approved, 2- rejected")
    private Integer loginApproval;


    @Column(name = "login_reject_note")
    private String loginRejectNote;

    @Size(max = 250)
    @Column(name = "location")
    private String location;


}
