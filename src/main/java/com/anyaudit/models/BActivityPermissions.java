package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "b_activity_permissions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BActivityPermissions extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bact_per_id")
    private Long bactPerId;

    @Size(max = 11)
    @Column(name = "bact_id")
    private Integer bactId;

    @Size(max = 11)
    @Column(name = "user_id")
    private Integer userId;

    @Size(max = 11)
    @Column(name = "created_on")
    private Integer createdOn;

    @Comment("0,1")
    @Column(name = "status")
    private Integer status;

}
