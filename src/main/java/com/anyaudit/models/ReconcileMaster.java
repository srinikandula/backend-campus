package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "reconcile_master")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReconcileMaster extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "lefttable", length = 255)
    private String leftTable;

    @Column(name = "righttable", length = 255)
    private String rightTable;

    @Column(name = "assignment_id")
    private Integer assignmentId;
}
