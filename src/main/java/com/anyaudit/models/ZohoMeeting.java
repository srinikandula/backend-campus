package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "zoho_meeting")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ZohoMeeting extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "title")
    private String title;

    @Size(max = 255)
    @Column(name = "speaker")
    private String speaker;

    @Size(max = 255)
    @Column(name = "topic")
    private String topic;

    @Column(name = "schedule_date")
    private Date scheduleDate;

    @Size(max = 20)
    @Column(name = "duration")
    private String duration;

    @Size(max = 11)
    @Column(name = "fee")
    private Integer fee;

    @Size(max = 255)
    @Column(name = "zoho_Session_id")
    private String zohoSessionId;

    @Size(max = 11)
    @Column(name = "att_id")
    private Integer attId;

    @Enumerated(EnumType.STRING)
    @Column(name="webinar_status")
    private EWebinarStatusRole webinarStatus;

    @Enumerated(EnumType.STRING)
    @Column(name="highlights")
    private EHighlightsRole highlights;

    @Enumerated(EnumType.STRING)
    @Column(name="is_deleted")
    private EIsDeletedRole isDeleted;
}
