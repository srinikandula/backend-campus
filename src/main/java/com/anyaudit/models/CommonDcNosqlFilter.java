package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import javax.validation.constraints.Size;

@Entity
@Table(name = "common_dc_nosql_filter")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommonDcNosqlFilter extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 11)
    @Column(name = "common_dc_nosql_main_id")
    private Integer commonDcNosqlMainId;

    @Column(name = "condition_display", columnDefinition = "TEXT")
    private String conditionDisplay;

    @Column(name = "condition_sq", columnDefinition = "TEXT")
    private String conditionSq;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;


    @Column(name = "new_column_name", length = 255)
    private String newColumnName;

    @Size(max = 11)
    @Column(name = "records_count")
    private Integer recordsCount;


    @Column(name = "filter_num", columnDefinition = "int default 0")
    private Integer filterNum;

    @Column(name = "orderby", columnDefinition = "TEXT")
    private String orderby;

}
