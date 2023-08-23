package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "assignment_impact_values")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AssignmentImpactValues extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "impact_id")
    private Integer impactId;

    @Size(max = 255)
    @Column(name = "impact_value")
    private String impactValue;

    @Column(name = "is_deleted", columnDefinition = "int(1) default 0")
    private Integer isDeleted;
}
