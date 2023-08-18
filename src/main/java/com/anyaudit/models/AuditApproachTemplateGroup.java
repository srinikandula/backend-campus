package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "audit_approach_template_group", uniqueConstraints = {
        @UniqueConstraint(columnNames = "group_name"),

})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuditApproachTemplateGroup extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "group_name")
    private String groupName;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;
}
