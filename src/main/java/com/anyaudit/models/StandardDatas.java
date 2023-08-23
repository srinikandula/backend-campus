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
public class StandardDatas  extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 250)
    private String name;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Column(name = "status", nullable = false, columnDefinition = "int default 1")
    private Integer status;
}
