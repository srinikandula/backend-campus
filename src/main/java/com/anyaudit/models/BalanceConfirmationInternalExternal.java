package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "balance_confirmation_internal_external")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BalanceConfirmationInternalExternal extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("ID of the balance confirmation")
    @Column(name = "id")
    private Long id;

    @Column(name = "client_id")
    @Comment("ID of the client.")
    private Long clientId;

    @Column(name = "assignment_id")
    @Comment("ID of the assignment.")
    private Long assignmentId;

    @Column(name = "element_name", length = 255)
    private String elementName;

    @Column(name = "subject_name", length = 255)
    private String subjectName;

    @Column(name = "element_id")
    private Integer elementId;

    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "transaction_date")
    @Temporal(TemporalType.DATE)
    private Date transactionDate;

    @Column(name = "internal_type", length = 255)
    private String internalType;

    @Column(name = "internal_amount")
    private Float internalAmount;

    @Column(name = "internal_remarks", columnDefinition = "text")
    private String internalRemarks;

    @Column(name = "external_type", length = 255)
    private String externalType;

    @Column(name = "external_amount")
    private Float externalAmount;

    @Column(name = "external_remarks", columnDefinition = "text")
    private String externalRemarks;

    @Column(name = "external_created_by")
    private Integer externalCreatedBy;

    @Column(name = "external_created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date externalCreatedOn;

    @Column(name = "external_approved_by")
    private Integer externalApprovedBy;

    @Column(name = "internal_created_by")
    private Integer internalCreatedBy;

    @Column(name = "internal_created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date internalCreatedOn;

    @Column(name = "internal_approved_by")
    private Integer internalApprovedBy;

}
