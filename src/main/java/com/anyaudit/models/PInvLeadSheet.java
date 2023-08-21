package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "p_inv_leadsheet")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PInvLeadSheet extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lid")
    private Long lid;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Column(name = "rawmaterial", columnDefinition = "double(10,2)")
    private Double rawMaterial;

    @Column(name = "work_in_progress", columnDefinition = "double(10,2)")
    private Double workInProgress;

    @Column(name = "export_of_services", columnDefinition = "double(10,2)")
    private Double exportOfServices;

    @Column(name = "finished_goods", columnDefinition = "double(10,2)")
    private Double finishedGoods;

    @Column(name = "sub_total1", columnDefinition = "double(10,2)")
    private Double subTotal1;

    @Column(name = "stores", columnDefinition = "double(10,2)")
    private Double stores;

    @Column(name = "spares", columnDefinition = "double(10,2)")
    private Double spares;

    @Column(name = "consumables", columnDefinition = "double(10,2)")
    private Double consumables;

    @Column(name = "sub_total2", columnDefinition = "double(10,2)")
    private Double subTotal2;

    @Column(name = "grand_total", columnDefinition = "double(10,2)")
    private Double grandTotal;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

}
