package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "template_risk_assertions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TemplateRiskAssertions extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "agreement_risk_id")
    private Integer agreementRiskId;

    @Size(max = 11)
    @Column(name = "assertion_id")
    private Integer assertionId;
}
