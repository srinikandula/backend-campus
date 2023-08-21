package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "p_inv_quantitative_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PInvQuantitativeDetails extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qid")
    private Long qid;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private String assignmentId;

    @Size(max = 250)
    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="category")
    private ECategory category;

    @Size(max = 50)
    @Column(name = "uom")
    private String uom;

    @Column(name = "opening_qty", columnDefinition = "double(8,2)")
    private Double openingQty;

    @Column(name = "opening_val")
    private Double openingVal;

    @Column(name = "purchase_qty", columnDefinition = "double(10,2)")
    private Double purchaseQty;

    @Column(name = "purchase_val")
    private Double purchaseVal;

    @Column(name = "produced_qty", columnDefinition = "double(10,2)")
    private Double producedQty;

    @Column(name = "produced_val")
    private Double producedVal;

    @Column(name = "transferred_in_qty", columnDefinition = "double(8,2)")
    private Double transferredInQty;

    @Column(name = "transferred_in_val")
    private Double transferredInVal;

    @Column(name = "consumed_qty", columnDefinition = "double(8,2)")
    private Double consumedQty;

    @Column(name = "consumed_val")
    private Double consumedVal;

    @Column(name = "sold_qty", columnDefinition = "double(8,2)")
    private Double soldQty;

    @Column(name = "sold_val")
    private Double soldVal;

    @Column(name = "transferred_out_qty", columnDefinition = "double(8,2)")
    private Double transferredOutQty;

    @Column(name = "transferred_out_val")
    private Double transferredOutVal;

    @Column(name = "closing_qty", columnDefinition = "double(8,2)")
    private Double closingQty;

    @Column(name = "closing_val")
    private Double closingVal;

    @Column(name = "physical_verification_qty", columnDefinition = "double(8,2)")
    private Double physicalVerificationQty;

    @Column(name = "physical_verification_val")
    private Double physicalVerificationVal;

    @Column(name = "shortage_excess_qty", columnDefinition = "double(8,2)")
    private Double shortageExcessQty;

    @Column(name = "shortage_excess_val")
    private Double shortageExcessVal;


    @Column(name = "remarks")
    private String remarks;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

}
