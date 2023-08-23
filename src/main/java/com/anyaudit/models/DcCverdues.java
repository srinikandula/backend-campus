package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "dc_overdues", indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id"),
        @Index(name = "assignment_id_2_index", columnList = "assignment_id")
} )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DcCverdues extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 5)
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "amount_irregularity", precision = 20, scale = 2)
    private Double amountIrregularity;

    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;

    @Column(name = "remarks", columnDefinition = "text")
    private String remarks;

    @Size(max = 5)
    @Column(name = "audit_procedure_id")
    private Integer auditProcedureId;


    @Size(max = 5)
    @Column(name = "chapter_id")
    private Integer chapterId;

    @Size(max = 5)
    @Column(name = "approver_user")
    private Integer approverUser;

    @Size(max = 5)
    @Column(name = "doerUser")
    private Integer doerUser;

    @Size(max = 1)
    @Column(name = "status")
    private Integer status;

    @Size(max = 5)
    @Column(name = "attachment_id")
    private Integer attachmentId;

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

    @Column(name = "name", nullable = false, length = 250)
    private String name;


}
