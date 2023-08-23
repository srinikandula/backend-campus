package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dc_parties", indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
} )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DcParties extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 250)
    private String name;

    @Column(name = "vendor_code", length = 250)
    private String vendorCode;

    @Column(name = "vendor_address", columnDefinition = "text")
    private String vendorAddress;

    @Column(name = "vendor_phone", length = 250)
    private String vendorPhone;

    @Column(name = "vendor_pan", length = 250)
    private String vendorPan;

    @Column(name = "vendor_email", length = 250)
    private String vendorEmail;

    @Column(name = "nature_of_party", columnDefinition = "text")
    private String natureOfParty;

    @Column(name = "types_of_agreements", length = 250)
    private String typesOfAgreements;

    @Column(name = "remarks", columnDefinition = "text")
    private String remarks;

    @Column(name = "strata_A")
    private Integer strataA;

    @Column(name = "strata_B")
    private Integer strataB;

    @Column(name = "strata_C")
    private Integer strataC;

    @Column(name = "strata_D")
    private Integer strataD;

    @Column(name = "strata_E")
    private Integer strataE;

    @Column(name = "filter_l")
    private Integer filterL;

    @Column(name = "filter_m")
    private Integer filterM;

    @Column(name = "filter_n")
    private Integer filterN;

    @Column(name = "filter_o")
    private Integer filterO;

    @Column(name = "filter_p")
    private Integer filterP;

    @Column(name = "materiality")
    private Integer materiality;

    @Column(name = "batchno")
    private Integer batchNo;

    @Column(name = "temp_code", length = 250)
    private String tempCode;

    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "status_of_approval")
    private Integer statusOfApproval;

    @Column(name = "status_active")
    private Integer statusActive;


    @Column(name = "approved_by")
    private Integer approvedBy;

    @Column(name = "approved_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedOn;

    @Column(name = "other1", length = 250)
    private String other1;

    @Column(name = "other2", columnDefinition = "text")
    private String other2;

    @Column(name = "other3")
    @Temporal(TemporalType.DATE)
    private Date other3;

    @Column(name = "ass_seq_id")
    private Integer assSeqId;

    @Column(name = "ass_seq_txt", length = 15)
    private String assSeqTxt;

}
