package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "custom_drafts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomDrafts extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "draft_name")
    private String draftName;

    @Size(max = 10)
    @Column(name = "status")
    private String status;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;

    @Column(name = "scheduler_id",columnDefinition = "int default 0")
    private Integer schedulerId;



}
