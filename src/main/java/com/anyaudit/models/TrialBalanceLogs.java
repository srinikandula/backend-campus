package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "trial_balance_logs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrialBalanceLogs extends BaseModel{

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

    @Column(name = "credit_amount", columnDefinition = "double(20,2)")
    private Double creditAmount;

    @Column(name = "net_amount", columnDefinition = "double(20,2)")
    private Double netAmount;

    @Column(name = "debit_amount", columnDefinition = "double(20,2)")
    private Double debitAmount;

    @Column(name = "created_on")
    private Date createdOn;

    @Size(max = 5)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 5)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 5)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 5)
    @Column(name = "batch_no")
    private Integer batchNo;

    @Size(max = 11)
    @Column(name = "batch_id")
    private Integer batchId;
}
