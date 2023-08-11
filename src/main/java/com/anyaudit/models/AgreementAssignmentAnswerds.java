package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "agreement_assignment_answerds")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AgreementAssignmentAnswerds extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Size(max = 20)
    @Column(name = "answer_id")
    private Long answerId;

    @Size(max = 11)
    @Column(name = "node_id",nullable = false)
    private int nodeId;

    @Column(name = "short_answer", nullable = false)
    private String shortAnswer;

    @Column(name = "long_answer", nullable = false)
    private String longAnswer;

}
