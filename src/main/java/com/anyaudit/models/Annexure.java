package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "annexure",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "annexure_name"),

        })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Annexure extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "annexure_id")
    private Integer annexureId;

    @Size(max = 250)
    @Column(name = "annexure_name")
    private String annexureName;

    @Column(name = "annexure_description")
    private String annexureDescription;

    @Size(max = 11)
    @Column(name = "chapter_id")
    private String chapterId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private String domainId;

    @Size(max = 11)
    @Column(name = "master_id",columnDefinition = " DEFAULT '0'")
    private String masterId;

    @Size(max = 11)
    @Column(name = "client_id")
    private String clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private String assignmentId;

    @Size(max = 1)
    @Column(name = "status",columnDefinition = " DEFAULT '1'")
    private Integer status;

    @Size(max = 5)
    @Column(name = "area_audit_id")
    private Integer areaAuditId;
}
