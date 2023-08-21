package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "p_inv_slowmoving")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PInvSlowMoving extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private Long sid;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 250)
    @Column(name = "name_of_the_inventory")
    private String nameOfTheInventory;

    @Size(max = 50)
    @Column(name = "uom")
    private String uom;

    @Column(name = "qty", columnDefinition = "double(8,2)")
    private Double qty;

    @Column(name = "val", columnDefinition = "double(15,2)")
    private Double val;

    @Size(max = 11)
    @Column(name = "slow_moving_days")
    private Integer slowMovingDays;

    @Column(name = "provision_held", columnDefinition = "double(12,2)")
    private Double provisionHeld;


    @Column(name = "reasons_for_slow_movement")
    private String reasonsForSlowMovement;

    @Column(name = "req_of_additional_provision")
    private String reqOfAdditionalProvision;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;



}
