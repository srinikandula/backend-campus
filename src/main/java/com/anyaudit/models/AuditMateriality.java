package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "audit_materiality")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuditMateriality extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 50)
    @Column(name = "gross_turnover")
    private String grossTurnover;

    @Size(max = 50)
    @Column(name = "previous_gross_turnover")
    private String previousGrossTurnover;

    @Size(max = 50)
    @Column(name = "cogs")
    private String cogs;

    @Size(max = 50)
    @Column(name = "previous_cogs")
    private String previousCogs;

    @Size(max = 50)
    @Column(name = "pbt")
    private String pbt;

    @Size(max = 70)
    @Column(name = "previous_pbt")
    private String previousPbt;

    @Size(max = 70)
    @Column(name = "pat")
    private String pat;

    @Size(max = 70)
    @Column(name = "previous_pat")
    private String previousPat;

    @Size(max = 70)
    @Column(name = "ebitda")
    private String ebitda;

    @Size(max = 70)
    @Column(name = "previous_ebitda")
    private String previousEbitda;

    @Size(max = 70)
    @Column(name = "net_worth")
    private String netWorth;

    @Size(max = 70)
    @Column(name = "previous_net_worth")
    private String previousNetWorth;

    @Size(max = 70)
    @Column(name = "sum_assets_liabilties")
    private String sumAssetsLiabilties;

    @Size(max = 70)
    @Column(name = "previous_sum_assets_liabilties")
    private String previousSumAssetsLiabilties;

    @Size(max = 70)
    @Column(name = "pnl_factor")
    private String pnlFactor;

    @Size(max = 70)
    @Column(name = "previous_pnl_factor")
    private String previousPnlFactor;

    @Size(max = 70)
    @Column(name = "pnl_percentage")
    private String pnlPercentage;

    @Size(max = 70)
    @Column(name = "previous_pnl_percentage")
    private String previousPnlPercentage;

    @Size(max = 50)
    @Column(name = "pnl_a_b")
    private String pnlAB;

    @Size(max = 50)
    @Column(name = "previous_pnl_a_b")
    private String previousPnlAB;

    @Size(max = 50)
    @Column(name = "pnl_minimum")
    private String pnlMinimum;


    @Size(max = 50)
    @Column(name = "previous_pnl_minimum")
    private String previousPnlMinimum;

    @Size(max = 50)
    @Column(name = "pnl_materiality")
    private String pnlMateriality;

    @Size(max = 50)
    @Column(name = "previous_pnl_materiality")
    private String previousPnlMateriality;

    @Size(max = 50)
    @Column(name = "bs_factor")
    private String bsFactor;

    @Size(max = 50)
    @Column(name = "previous_bs_factor")
    private String previousBsFactor;

    @Size(max = 50)
    @Column(name = "bs_percentage")
    private String bsPercentage;

    @Size(max = 50)
    @Column(name = "previous_bs_percentage")
    private String previousBsPercentage;

    @Size(max = 50)
    @Column(name = "bs_a_b")
    private String bsAB;

    @Size(max = 50)
    @Column(name = "previous_bs_a_b")
    private String previousBsAB;

    @Size(max = 50)
    @Column(name = "bs_minimum")
    private String bsMinimum;

    @Size(max = 50)
    @Column(name = "previous_bs_minimum")
    private String previousBsMinimum;

    @Size(max = 50)
    @Column(name = "bs_materiality")
    private String bsMateriality;

    @Size(max = 50)
    @Column(name = "previous_bs_materiality")
    private String previousBsMateriality;

    @Size(max = 11)
    @Column(name = "client")
    private Integer client;

    @Size(max = 11)
    @Column(name = "assignment")
    private Integer assignment;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

    @Size(max = 11)
    @Column(name = "audit_response_id")
    private Integer auditResponseId;

    @Size(max = 4)
    @Column(name = "save_status")
    private Integer saveStatus;

    @Column(name = "previous_pnl_remarks")
    private String previousPnlRemarks;

    @Column(name = "pnl_remarks")
    private String pnlRemarks;

    @Column(name = "bs_remarks")
    private String bsRemarks;




}
