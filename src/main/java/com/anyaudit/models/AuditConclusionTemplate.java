package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "audit_conclusion_template",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "template_name")
        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuditConclusionTemplate extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "template_name")
    private String templateName;

    @Size(max = 255)
    @Column(name = "data_values")
    private String dataValues;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "status", columnDefinition = "int default 1")
    private Integer status;

    @Column(name = "master_id", columnDefinition = "int default 0")
    private Integer masterId;
}

