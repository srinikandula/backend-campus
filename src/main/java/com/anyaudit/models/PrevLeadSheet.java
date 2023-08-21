package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "p_rev_leadsheet")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class PrevLeadSheet extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plid")
    private Long plid;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Column(name = "export_of_services", columnDefinition = "double(10,2)")
    private Double exportOfServices;

    @Column(name = "export_of_goods", columnDefinition = "double(10,2)")
    private Double exportOfGoods;

    @Column(name = "total_exports", columnDefinition = "double(15,2)")
    private Double totalExports;

    @Column(name = "sale_of_goods", columnDefinition = "double(10,2)")
    private Double saleOfGoods;

    @Column(name = "sale_of_services", columnDefinition = "double(10,2)")
    private Double saleOfServices;

    @Column(name = "sub_total", columnDefinition = "double(15,2)")
    private Double subTotal;

    @Column(name = "other_operational_income", columnDefinition = "double(15,2)")
    private Double otherOperationalIncome;

    @Column(name = "non_operational_income", columnDefinition = "double(15,2)")
    private Double nonOperationalIncome;

    @Column(name = "grand_total", columnDefinition = "double(18,2)")
    private Double grandTotal;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;


}
