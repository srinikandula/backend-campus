package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "remainder_performance", indexes = {
        @Index(name = "reminder_id_index", columnList = "reminder_id"),
        @Index(name = "id", columnList = "id")
} )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RemainderPerformance  extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "reminder_id")
    private Integer reminderId;

    @Column(name = "domain", columnDefinition = "int default 0")
    private Integer domain;

    @Column(name = "performance_description")
    private String performanceDescription;


    @Column(name = "performance_next_expiry_remainder")
    private Date performanceNextExpiryRemainder;


    @Size(max = 11)
    @Column(name = "performance_notify_before_days")
    private Integer performanceNotifyBeforeDays;

    @Column(name = "performance_attachment")
    private String performanceAttachment;
}
