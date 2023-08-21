package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "remainder")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Remainder extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "remainder_id")
    private Long remainderId;

    @Size(max = 250)
    @Column(name = "remainder_name")
    private String remainderName;

    @Column(name = "description")
    private String description;

    @Size(max = 250)
    @Column(name = "client")
    private String client;

    @Size(max = 20)
    @Column(name = "expiry_type")
    private String expiryType;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "next_expiry_remainder")
    private Date nextExpiryRemainder;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

    @Column(name = "radio_status")
    @Comment("1=public,2=private")
    private Integer radioStatus;

    @ColumnDefault("0")
    @Column(name = "notify_before_days")
    private Integer notifyBeforeDays;

    @Column(name = "reminder_sent_date")
    private Date reminderSentDate;

}
