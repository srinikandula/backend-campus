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
@Table(name = "fsr_dc_trail_balance",uniqueConstraints = {
        @UniqueConstraint(name = "gl_uniq", columnNames = {"gl_name", "location_name","company_id","assignment_id"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrDcTrailBalance extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 200)
    @Column(name = "gl_name")
    private String glName;

    @Size(max = 5)
    @Column(name = "gl_id")
    private Integer glId;

    @Size(max = 50)
    @Column(name = "location_name")
    private String locationName;

    @Size(max = 5)
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "opening_amount", columnDefinition = "double(20,2)")
    private Double openingAmount;

    @Column(name = "debit_amount", columnDefinition = "double(20,2)")
    private Double debitAmount;

    @Column(name = "credit_amount", columnDefinition = "double(20,2)")
    private Double creditAmount;

    @Column(name = "net_amount", columnDefinition = "double(20,2)")
    private Double netAmount;

    @Column(name = "db_opening_amount", columnDefinition = "double(20,2)")
    private Double dbOpeningAmount;

    @Column(name = "db_debit_amount", columnDefinition = "double(20,2)")
    private Double dbDebitAmount;

    @Column(name = "db_credit_amount", columnDefinition = "double(20,2)")
    private Double dbCreditAmount;

    @Column(name = "db_net_amount", columnDefinition = "double(20,2)")
    private Double dbNetAmount;

    @Size(max = 5)
    @Column(name = "fss_list_id")
    private Integer fssListId;

    @Size(max = 5)
    @Column(name = "approved_by")
    private Integer approvedBy;


    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "approved_on")
    private Date approvedOn;

    @Size(max = 5)
    @Column(name = "filter_L")
    private Integer filterL;

    @Size(max = 5)
    @Column(name = "filter_M")
    private Integer filterM;

    @Size(max = 5)
    @Column(name = "filter_N")
    private Integer filterN;

    @Size(max = 5)
    @Column(name = "filter_O")
    private Integer filterO;

    @Size(max = 5)
    @Column(name = "filter_P")
    private Integer filterP;

    @Size(max = 5)
    @Column(name = "strata_A")
    private Integer strataA;

    @Size(max = 5)
    @Column(name = "strata_B")
    private Integer strataB;

    @Size(max = 5)
    @Column(name = "strata_C")
    private Integer strataC;

    @Size(max = 5)
    @Column(name = "strata_D")
    private Integer strataD;

    @Size(max = 5)
    @Column(name = "strata_E")
    private Integer strataE;

    @Size(max = 5)
    @Column(name = "company_id")
    private Integer companyId;

    @Size(max = 5)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 5)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 5)
    @Column(name = "batch_no")
    private Integer batchNo;

    @Column(name = "rectification_total", precision = 22, scale = 2)
    private BigDecimal rectificationTotal;

    @Column(name = "reclassification_total", precision = 22, scale = 2)
    private BigDecimal reclassificationTotal;

    @Size(max = 255)
    @Column(name = "category_id")
    private String categoryId;

}
