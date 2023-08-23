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
@Table(name = "firm_policy_signatories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FirmPolicySignatories extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cds_id")
    private Long cdsId;

    @Size(max = 11)
    @Column(name = "firm_policy_id")
    private Integer firmPolicyId;

    @Size(max = 11)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "acceptance_status")
    @Comment("1-Accepted, 0 - Not accepted")
    private Integer acceptanceStatus;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "dt_of_signoff")
    private Date dtOfSignoff;

    @Size(max = 11)
    @Column(name = "att_id")
    private Integer attId;

    @Column(name = "creation_dt")
    private Date creationDt;

}
