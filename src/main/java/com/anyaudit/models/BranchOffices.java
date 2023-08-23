package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "branch_offices", uniqueConstraints = {
        @UniqueConstraint(name = "bo_name", columnNames = {"bo_name"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BranchOffices extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bo_id")
    private Long boId;

    @Size(max = 250)
    @Column(name = "bo_name")
    private String boName;

    @Column(name = "creation_dt")
    private Date creationDt;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;
}
