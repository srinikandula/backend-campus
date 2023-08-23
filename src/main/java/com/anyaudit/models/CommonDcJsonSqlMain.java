package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "common_dc_jsonsql_main")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommonDcJsonSqlMain extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "title")
    private String title;

    @Size(max = 255)
    @Column(name = "trail_balance_table")
    private String trailBalanceTable;

    @Size(max = 255)
    @Column(name = "groups_table")
    private String groupsTable;

    @Size(max = 255)
    @Column(name = "db_table")
    private String dbTable;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private EStatusRole status;

    @Size(max = 255)
    @Column(name = "s3Object")
    private String s3Object;

    @Size(max = 255)
    @Column(name = "mapcol")
    private String mapCol;

}
