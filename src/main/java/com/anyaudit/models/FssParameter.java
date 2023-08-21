package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "fss_parameter" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FssParameter extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 50)
    @Column(name = "current_year_heading")
    private String currentYearHeading;

    @Size(max = 50)
    @Column(name = "previous_current_year_heading")
    private String previousCurrentYearHeading;

    @Size(max = 50)
    @Column(name = "prv_current_year_heading")
    private String prvCurrentYearHeading;

    @Size(max = 50)
    @Column(name = "previous_prv_current_year_heading")
    private String previousPrvCurrentYearHeading;

    @Size(max = 50)
    @Column(name = "denomination_amounts")
    private String denominationAmounts;

    @Size(max = 50)
    @Column(name = "previous_denomination_amounts")
    private String previousDenominationAmounts;

    @Size(max = 50)
    @Column(name = "balance_sheet_heading")
    private String balanceSheetHeading;

    @Size(max = 50)
    @Column(name = "previous_balance_sheet_heading")
    private String previousBalanceSheetHeading;

    @Size(max = 50)
    @Column(name = "SOPL_heading")
    private String SOPLHeading;


    @Size(max = 50)
    @Column(name = "previous_SOPL_heading")
    private String previousSOPLHeading;

    @Size(max = 50)
    @Column(name = "cash_flow_heading")
    private String cashFlowHeading;

    @Size(max = 50)
    @Column(name = "previous_cash_flow_heading")
    private String previousCashFlowHeading;

    @Size(max = 100)
    @Column(name = "name_firm")
    private String nameFirm;

    @Size(max = 100)
    @Column(name = "previous_name_firm")
    private String previousNameFirm;

    @Size(max = 50)
    @Column(name = "frn")
    private String frn;

    @Size(max = 50)
    @Column(name = "previous_frn")
    private String previousFrn;


    @Size(max = 50)
    @Column(name = "sigining_patner")
    private String siginingPatner;

    @Size(max = 100)
    @Column(name = "previous_Sigining_patner")
    private String previousSiginingPatner;

    @Size(max = 50)
    @Column(name = "membership_no")
    private String membershipNo;

    @Size(max = 50)
    @Column(name = "previous_membership_no")
    private String previousMembershipNo;

    @Size(max = 100)
    @Column(name = "director1_name")
    private String director1Name;

    @Size(max = 100)
    @Column(name = "previous_director1_name")
    private String previousDirector1Name;

    @Size(max = 50)
    @Column(name = "designation_director1_name")
    private String designationDirector1Name;

    @Size(max = 50)
    @Column(name = "previous_designation_director1_name")
    private String previousDesignationDirector1Name;

    @Size(max = 100)
    @Column(name = "director2_name")
    private String director2Name;

    @Size(max = 50)
    @Column(name = "previous_director2_name")
    private String previousDirector2Name;

    @Size(max = 50)
    @Column(name = "designation_director2_name")
    private String designationDirector2Name;

    @Size(max = 50)
    @Column(name = "previous_designation_director2_name")
    private String previousDesignationDirector2Name;


    @Column(name = "date_fss")
    private Date dateFss;


    @Column(name = "previous_date_fss")
    private Date previousDateFss;

    @Size(max = 100)
    @Column(name = "place_fss")
    private String placeFss;

    @Size(max = 100)
    @Column(name = "previous_place_fss")
    private String previousPlaceFss;

    @Column(name = "date_agm")
    private Date dateAgm;


    @Column(name = "previous_date_agm")
    private Date previousDateAgm;


    @Column(name = "date_issuance")
    private Date dateIssuance;


    @Column(name = "previous_date_issuance")
    private Date previousDateIssuance;


    @Size(max = 11)
    @Column(name = "client")
    private Integer client;

    @Size(max = 11)
    @Column(name = "assignment")
    private Integer assignment;

    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;

}


