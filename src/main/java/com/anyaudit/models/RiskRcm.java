package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "risk_rcm")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RiskRcm extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "activity_risk_id")
    private Integer activityRiskId;

    @Size(max = 11)
    @Column(name = "risk_master_id")
    private Integer riskMasterId;
}
