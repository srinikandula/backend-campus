package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "taskstatuslog")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TaskStatusLog extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignmentid")
    private String assignmentId;

    @Size(max = 11)
    @Column(name = "tasklistid")
    private String tasklistId;

    @Size(max = 11)
    @Column(name = "previous_status")
    private String previousStatus;

    @Size(max = 11)
    @Column(name = "current_status")
    private String currentStatus;

    @Size(max = 11)
    @Column(name = "value")
    private String value;

    @Size(max = 11)
    @Column(name = "changed_user")
    private String changedUser;
}
