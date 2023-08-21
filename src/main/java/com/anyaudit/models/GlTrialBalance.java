package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "gl_trial_balance", indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id")
} )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GlTrialBalance extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 20)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Enumerated(EnumType.STRING)
    @Column(name = "classification_type")
    private EClassificationType classificationType;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;


    @Column(name = "amount", precision = 15, scale = 2)
    private BigDecimal amount;

    @Size(max = 11)
    @Column(name = "gl_id")
    private Integer glId;

    @Enumerated(EnumType.STRING)
    @Column(name = "mode")
    private EMode mode;


    @Size(max = 20)
    @Column(name = "location_id")
    private Long locationId;


    @Size(max = 250)
    @Column(name = "name")
    private String name;

    @Size(max = 250)
    @Column(name = "gl_code")
    private String glCode;

    @Size(max = 250)
    @Column(name = "gl_dummy")
    private String glDummy;

    @Size(max = 250)
    @Column(name = "loc_dummy")
    private String locDummy;


    @Column(name = "remarks")
    private String remarks;

    @Size(max = 11)
    @Column(name = "batchno")
    private Integer batchNo;

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

    @Column(name = "materialized_val")
    private Integer materializedValue;

    @Size(max = 250)
    @Column(name = "other1")
    private String other1;

    @Size(max = 250)
    @Column(name = "other2")
    private String other2;

    @Size(max = 250)
    @Column(name = "other3")
    private String other3;

    @Column(name = "sum_rectification")
    private Double sumRectification;

    @Column(name = "sum_grand_total")
    private Double sumGrandTotal;


    @Column(name = "opening_balance", precision = 20, scale = 2)
    private BigDecimal openingBalance;

    @Column(name = "debit", precision = 20, scale = 2)
    private BigDecimal debit;

    @Column(name = "credit", precision = 20, scale = 2)
    private BigDecimal credit;

    @Size(max = 11)
    @Column(name = "status_of_approval")
    private Integer statusOfApproval;

    @Size(max = 11)
    @Column(name = "approved_by")
    private Integer approvedBy;


    @Column(name = "approved_on")
    private Date approvedOn;


    @Size(max = 11)
    @Column(name = "daybook_gl_id")
    private Integer daybookGlId;

    @Column(name = "daybook_netamt", precision = 10, scale = 2)
    private BigDecimal daybookNetamt;
}
