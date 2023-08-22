package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "permissions_group_activities")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PermissionsAroupActivities extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pg_per_id")
    private Long pgPerId;

    @Size(max = 11)
    @Column(name = "bact_id")
    private Integer bactId;

    @Size(max = 11)
    @Column(name = "pgid")
    private Integer pgId;

    @Column(name = "status", nullable = false, columnDefinition = "int default 1 COMMENT '1,0'")
    private Integer status;
}
