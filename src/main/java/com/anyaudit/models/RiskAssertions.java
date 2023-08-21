package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "risk_assertions" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RiskAssertions extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "activity_risk_id")
    private Integer activityRiskId;

    @Size(max = 11)
    @Column(name = "assertion_id")
    private Integer assertionId;
}
