package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "assignment_decision_values", indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "decision_id_index", columnList = "decision_id")
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AssignmentDecisionValues extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adv_id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "decision_id")
    private Integer decisionId;


    @Size(max = 1)
    @Column(name = "val")
    private Integer val;


    @Size(max = 15)
    @Column(name = "val_given", columnDefinition = "varchar(15) NOT NULL DEFAULT 'No' COMMENT 'YES,NO,NA'")
    private String valGiven;



}
