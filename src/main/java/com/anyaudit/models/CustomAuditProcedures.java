package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "custom_audit_procedures",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "name")
        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomAuditProcedures extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Size(max = 11)
    @Column(name = "chapter_id")
    private Integer chapterId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "status", columnDefinition = "int(1) default 1")
    private Integer status;


    @Size(max = 5)
    @Column(name = "area_audit_id")
    private Integer areaAuditId;
}
