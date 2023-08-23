package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "elt_risk_parameters_comparative")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EltRiskParametersComparative extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "erpid")
    private Integer erpid;

    @Size(max = 11)
    @Column(name = "elt_id")
    private Integer eltId;

    @Size(max = 11)
    @Column(name = "subj_id")
    private Integer subjId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "val", precision = 10, scale = 2)
    private Double val;

    @Column(name = "risk_para_id")
    private Integer riskParaId;


    @Size(max = 11)
    @Column(name = "status")
    private Integer status;


    @Size(max = 11)
    @Column(name = "approved_by")
    private Integer approvedBy;


    @Column(name = "approved_dt")
    private Date approvedDt;

}
