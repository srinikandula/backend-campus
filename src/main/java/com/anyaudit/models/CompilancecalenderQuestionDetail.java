package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "compilancecalender_question_detail")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompilancecalenderQuestionDetail extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qdid")
    private Long qdid;

    @Column(name = "qid")
    private Integer qid;

    @Column(name = "rating", length = 250)
    private String rating;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "status", length = 10)
    private String status;

    @Column(name = "sync_id")
    private Integer syncId;

    @Column(name = "sync_on")
    private LocalDateTime syncOn;

    @Column(name = "master_id")
    private Integer masterId;

    @Column(name = "master_parent_id")
    private Integer masterParentId;
}
