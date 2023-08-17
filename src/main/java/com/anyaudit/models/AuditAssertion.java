package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "audit_assertion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuditAssertion extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assertion_id")
    private Integer assertionId;

    @NotBlank
    @Column(name = "assertion_name",nullable = false)
    private String assertionName;

    @NotBlank
    @Column(name = "assertion_status",nullable = false)
    private String assertionStatus;

    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "master_id",nullable = false)
    private Integer masterId;
}
