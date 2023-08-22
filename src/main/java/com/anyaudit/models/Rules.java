package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "rules")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rules extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rule_id")
    private Long ruleId;

    @Size(max = 250)
    @Column(name = "rule_name")
    private String ruleName;

    @Column(name = "description")
    private String description;

    @Size(max = 11)
    @Column(name = "element_id")
    private Integer elementId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

}
