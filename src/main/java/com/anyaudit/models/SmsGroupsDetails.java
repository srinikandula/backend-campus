package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sms_groups_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SmsGroupsDetails extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "groupid")
    private Integer groupId;

    @Size(max = 20)
    @Column(name = "phone_no")
    private Integer phoneNo;

    @Size(max = 150)
    @Column(name = "membername")
    private String memberName;

    @Comment("owner,accountant,contact")
    @Column(name = "membertype")
    private String memberType;

    @Size(max = 150)
    @Column(name = "membertypename")
    private String memberTypeName;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

}
