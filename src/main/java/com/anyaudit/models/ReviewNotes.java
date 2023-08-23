package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "review_notes" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReviewNotes extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 11)
    @Column(name = "assig_sched_id")
    private Integer assigSchedId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;


    @Column(name = "review_notes")
    private String reviewNotes;

    @Size(max = 11)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "read_flag", columnDefinition = "int(1) NOT NULL DEFAULT '0' COMMENT '1-read, 0-unread'")
    private Integer readFlag;
}
