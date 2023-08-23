package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "firm_policy_config")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FirmPolicyConfig extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdc_id")
    private Long cdcId;

    @Size(max = 11)
    @Column(name = "d_type")
    private Integer dType;

    @Size(max = 11)
    @Column(name = "d_type_id")
    private Integer dTypeId;

    @Size(max = 11)
    @Column(name = "order_id")
    private Integer orderId;

    @Comment("0-No,1-Yes")
    @Column(name = "link_chk")
    private Integer linkChk;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

    @Column(name = "status")
    @Comment("0-not approved,1-approved")
    private Integer status;

    @Column(name = "creation_dt")
    private Date creationDt;

    @Size(max = 11)
    @Column(name = "att_id")
    private Integer attId;

    @Size(max = 11)
    @Column(name = "firm_policy_id")
    private Integer firmPolicyId;

    @Column(name = "description")
    private String description;
}
