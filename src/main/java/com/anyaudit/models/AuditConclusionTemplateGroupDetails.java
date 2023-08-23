package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "audit_conclusion_template_group")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuditConclusionTemplateGroupDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "group_id")
    private Integer groupId;

    @Size(max = 11)
    @Column(name = "template_id")
    private Integer templateId;

    @Size(max = 11)
    @Column(name = "order_id")
    private Integer orderId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;
}
