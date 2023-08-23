package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "firm_policy")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FirmPolicy extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "firm_policy_name")
    private String firmPolicyName;

    @Size(max = 10)
    @Column(name = "status")
    private String status;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Date updatedOn;

    @Size(max = 11)
    @Column(name = "approver_user")
    private Integer approverUser;

    @Size(max = 11)
    @Column(name = "doer_user")
    private Integer doerUser;
}
