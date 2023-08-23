package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "rule_stmts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RuleStmts extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rs_id")
    private Long rsId;

    @Size(max = 11)
    @Column(name = "rule_id")
    private Integer ruleId;

    @Size(max = 11)
    @Column(name = "field_id")
    private Integer fieldId;

    @Size(max = 11)
    @Column(name = "filter_type")
    private Integer filterType;


    @Size(max = 11)
    @Column(name = "filter_id")
    private String filterId;

    @Column(name = "field_val")
    private Integer fieldVal;

    @Size(max = 50)
    @Column(name = "operator")
    private String operator;

    @Size(max = 250)
    @Column(name = "val1")
    private String val1;

    @Size(max = 250)
    @Column(name = "val2")
    private String val2;

    @Size(max = 11)
    @Column(name = "set_filter")
    private Integer setFilter;

    @Size(max = 11)
    @Column(name = "set_value")
    private Integer setValue;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Size(max = 11)
    @Column(name = "master_parent_id")
    private Integer masterParentId;

}
