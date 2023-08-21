package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "da_filters")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DaFilters extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "common_dc_nosql_main_id")
    private Integer commonDcNosqlMainId;

    @Column(name = "condition_display")
    private String conditionDisplay;

    @Column(name = "condition_sql")
    private String conditionSql;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 255)
    @Column(name = "new_column_name")
    private String newColumnName;

    @Size(max = 11)
    @Column(name = "records_count")
    private Integer recordsCount;

    @ColumnDefault("0")
    @Column(name = "filter_num")
    private Integer filterNum;

    @Column(name = "orderby")
    private String orderBy;

    @Size(max = 4)
    @Column(name = "is_log")
    private Integer isLog;

    @Size(max = 255)
    @Column(name = "log_name")
    private String logName;

    @Size(max = 255)
    @Column(name = "search_category")
    private String searchCategory;

    @Column(name = "search_text")
    private String searchText;
}
