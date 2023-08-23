package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "dc_legal_suits",indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "assignment_id_2_index", columnList = "assignment_id")


})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DcLegalSuits extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 50)
    @Column(name = "account_no")
    private String accountNo;

    @Size(max = 80)
    @Column(name = "gl_no")
    private String glNo;

    @Size(max = 50)
    @Column(name = "customer_no")
    private String customerNo;

    @Size(max = 80)
    @Column(name = "customer_name")
    private String customerName;

    @Size(max = 20)
    @Column(name = "branch_name")
    private String branchName;

    @Size(max = 80)
    @Column(name = "customer_constitution")
    private String customerConstitution;

    @Size(max = 5)
    @Column(name = "customer_constitution_id")
    private Integer customerConstitutionId;


    @Column(name = "emi_start_date")
    private Date emiStartDate;

    @Size(max = 5)
    @Column(name = "emi_total_nos")
    private Integer emiTotalNos;

    @Size(max = 5)
    @Column(name = "emi_due")
    private Integer emiDue;

    @Size(max = 5)
    @Column(name = "emi_paid")
    private Integer emiPaid;

    @Size(max = 5)
    @Column(name = "emi_overdue")
    private Integer emiOverdue;

    @Column(name = "emi_closing_date")
    private Date emiClosingDate;

    @Size(max = 50)
    @Column(name = "emi_type")
    private String emiType;

    @Size(max = 5)
    @Column(name = "emi_type_id")
    private Integer emiTypeId;

    @Size(max = 250)
    @Column(name = "name")
    private String name;

    @Column(name = "dt_of_suit")
    private Date dtOfSuit;

    @Size(max = 250)
    @Column(name = "name_of_court")
    private String nameOfCourt;

    @Column(name = "nature_of_suit")
    private String natureOfSuit;

    @Size(max = 250)
    @Column(name = "name_of_counterpart")
    private String nameOfCounterpart;

    @Column(name = "amount", columnDefinition = "double(20,2)")
    private Double amount;

    @Column(name = "present_status_of_suit")
    private String presentStatusOfSuit;

    @Column(name = "amount_of_deposit", columnDefinition = "double(20,2)")
    private Double amountOfDeposit;

    @Column(name = "amount_of_provision", columnDefinition = "double(20,2)")
    private Double amountOfProvision;

    @Column(name = "remarks")
    private String remarks;

    @Size(max = 11)
    @Column(name = "strata_A")
    private Integer strataA;

    @Size(max = 11)
    @Column(name = "strata_B")
    private Integer strataB;

    @Size(max = 11)
    @Column(name = "strata_C")
    private Integer strataC;

    @Size(max = 11)
    @Column(name = "strata_D")
    private Integer strataD;

    @Size(max = 11)
    @Column(name = "strata_E")
    private Integer strataE;

    @Size(max = 11)
    @Column(name = "filter_l")
    private Integer filterL;

    @Size(max = 11)
    @Column(name = "filter_m")
    private Integer filterM;

    @Size(max = 11)
    @Column(name = "filter_n")
    private Integer filterN;

    @Size(max = 11)
    @Column(name = "filter_o")
    private Integer filterO;

    @Size(max = 11)
    @Column(name = "filter_p")
    private Integer filterP;

    @Size(max = 11)
    @Column(name = "materiality")
    private Integer materiality;

    @Size(max = 11)
    @Column(name = "batchno")
    private Integer batchNo;

    @Size(max = 250)
    @Column(name = "temp_code")
    private String tempCode;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "company_id")
    private Integer companyId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 11)
    @Column(name = "status_of_approval")
    private Integer statusOfApproval;

    @Size(max = 11)
    @Column(name = "status_active")
    private Integer statusActive;

    @Size(max = 11)
    @Column(name = "approved_by")
    private Integer approvedBy;

    @Column(name = "approved_on")
    private Date approvedOn;

    @Size(max = 250)
    @Column(name = "other1")
    private String other1;

    @Column(name = "other2")
    private String other2;

    @Column(name = "other3")
    private Date other3;

    @Size(max = 11)
    @Column(name = "ass_seq_id")
    private String assSeqId;

    @Size(max = 15)
    @Column(name = "ass_seq_txt")
    private String assSeqTxt;

    @Column(name = "sanctioned_date")
    private Date sanctionedDate;

    @Size(max = 200)
    @Column(name = "product_name")
    private String productName;

    @Size(max = 5)
    @Column(name = "product_id")
    private Integer productId;

    @Size(max = 200)
    @Column(name = "scheme_name")
    private String schemeName;

    @Size(max = 5)
    @Column(name = "scheme_id")
    private Integer schemeId;

    @Size(max = 200)
    @Column(name = "sector_name")
    private String sectorName;

    @Size(max = 5)
    @Column(name = "sector_id")
    private Integer sectorId;

    @Size(max = 200)
    @Column(name = "irac_name")
    private String iracName;

    @Size(max = 5)
    @Column(name = "irac_id")
    private Integer iracId;

    @Size(max = 200)
    @Column(name = "priority_name")
    private String priorityName;

    @Size(max = 5)
    @Column(name = "priority_id")
    private Integer priorityId;

    @Size(max = 200)
    @Column(name = "facility_name")
    private String facilityName;

    @Size(max = 5)
    @Column(name = "facility_id")
    private Integer facilityId;

    @Column(name = "sanctioned_amount", columnDefinition = "double(20,2)")
    private Double sanctionedAmount;

    @Column(name = "outstanding_amount", columnDefinition = "double(20,2)")
    private Double outstandingAmount;

    @Column(name = "overdue_amount", columnDefinition = "double(20,2)")
    private Double overdueAmount;

    @Column(name = "purchase_qty", columnDefinition = "double(10,2)")
    private Double purchaseQty;

    @Column(name = "accrued_interest_amount", columnDefinition = "double(20,2)")
    private Double accruedInterestAmount;

    @Column(name = "drawing_power_amount", columnDefinition = "double(20,2)")
    private Double drawingPowerAmount;

    @Column(name = "theoritical_balance_amount", columnDefinition = "double(20,2)")
    private Double theoriticalBalanceAmount;

    @Size(max = 80)
    @Column(name = "charge_type")
    private String chargeType;

    @Column(name = "primary_security_amount", columnDefinition = "double(20,2)")
    private Double primarySecurityAmount;

    @Column(name = "primary_security_valuation_date")
    private Date primarySecurityValuationDate;

    @Column(name = "collateral_security_amount", columnDefinition = "double(20,2)")
    private Double collateralSecurityAmount;

    @Column(name = "collateral_security_valuation_date")
    private Date collateralSecurityValuationDate;

    @Column(name = "tangible_security_amount", columnDefinition = "double(20,2)")
    private Double tangibleSecurityAmount;

    @Size(max = 200)
    @Column(name = "securedby_government_garantee")
    private String securedbyGovernmentGarantee;

    @Size(max = 200)
    @Column(name = "securedby_other_garantee")
    private String securedbyOtherGarantee;

    @Column(name = "securedby_deposits", columnDefinition = "double(20,2)")
    private Double securedbyDeposits;

    @Column(name = "unsecured_amount", columnDefinition = "double(20,2)")
    private Double unsecuredAmount;

    @Column(name = "insurance_amount", columnDefinition = "double(20,2)")
    private Double insuranceAmount;

    @Column(name = "insurance_expiry_date")
    private Date insuranceExpiryDate;

    @Column(name = "debit_summation", columnDefinition = "double(20,2)")
    private Double debitSummation;

    @Column(name = "interest_summation", columnDefinition = "double(20,2)")
    private Double interestSummation;

    @Column(name = "credit_summation", columnDefinition = "double(20,2)")
    private Double creditSummation;

    @Column(name = "irregular_days_summation", columnDefinition = "double(20,2)")
    private Double irregularDaysSummation;

    @Column(name = "internal_credit_rating", columnDefinition = "double(20,2)")
    private Double internalCreditRating;

    @Column(name = "external_credit_rating", columnDefinition = "double(20,2)")
    private Double externalCreditRating;

    @Size(max = 200)
    @Column(name = "opening_internal_credit_rating")
    private String openingInternalCreditRating;

    @Size(max = 200)
    @Column(name = "closing_external_credit_rating")
    private String closingExternalCreditRating;

    @Size(max = 5)
    @Column(name = "roi")
    private String roi;

    @Size(max = 50)
    @Column(name = "type_interest")
    private String typeInterest;




}
