package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "employee_benefits")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeBenefits extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "client")
    private Integer client;

    @Size(max = 11)
    @Column(name = "assignment")
    private Integer assignment;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Size(max = 50)
    @Column(name = "discount_rate")
    private Integer discountRate;

    @Size(max = 50)
    @Column(name = "salary_escalation")
    private Integer salaryEscalation;

    @Size(max = 50)
    @Column(name = "present_value_beginining_year")
    private Integer presentValueBegininingYear;

    @Size(max = 50)
    @Column(name = "interest_cost")
    private Integer interestCost;

    @Size(max = 50)
    @Column(name = "current_service_cost")
    private Integer currentServiceCost;

    @Size(max = 50)
    @Column(name = "benefits_paid")
    private Integer benefitsPaid;

    @Size(max = 50)
    @Column(name = "actuarial")
    private Integer actuarial;

    @Size(max = 50)
    @Column(name = "present_value_end_year")
    private Integer presentValueEndYear;

    @Size(max = 50)
    @Column(name = "fair_value_beginning_year")
    private Integer fairValueBeginningYear;

    @Size(max = 50)
    @Column(name = "return_plan_assets")
    private Integer returnPlanAssets;

    @Size(max = 50)
    @Column(name = "contributions")
    private Integer contributions;

    @Size(max = 50)
    @Column(name = "benefits_paid_2")
    private Integer benefitsPaid2;

    @Size(max = 50)
    @Column(name = "actuarial_asset")
    private Integer actuarialAsset;

    @Size(max = 50)
    @Column(name = "fair_value_end_year")
    private Integer fairValueEndYear;

    @Size(max = 50)
    @Column(name = "excess_obligation")
    private Integer excessObligation;

    @Size(max = 50)
    @Column(name = "current_service_cost_2")
    private Integer currentServiceCost2;

    @Size(max = 50)
    @Column(name = "interest_cost_2")
    private Integer interestCost2;

    @Size(max = 50)
    @Column(name = "expected_return")
    private Integer expectedReturn;

    @Size(max = 50)
    @Column(name = "net_actuarial")
    private Integer netActuarial;

    @Size(max = 50)
    @Column(name = "expenses")
    private Integer expenses;

    @Size(max = 50)
    @Column(name = "present_value")
    private Integer presentValue;

    @Size(max = 50)
    @Column(name = "fair_value_5")
    private Integer fairValue5;

    @Size(max = 50)
    @Column(name = "funded_status")
    private Integer fundedStatus;

    @Size(max = 50)
    @Column(name = "net_balance_Sheet")
    private Integer netBalanceSheet;

    @Column(name = "save_status", columnDefinition = "TINYINT(4)")
    private Integer saveStatus;


}
