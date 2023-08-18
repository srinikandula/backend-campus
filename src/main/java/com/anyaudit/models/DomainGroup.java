package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "domain_group")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DomainGroup extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(max = 250)
    @Column(name = "domain_group_name")
    private String domainGroupName;

    @Size(max = 20)
    @Column(name = "domain_grouptype")
    private String domainGroupType;

    @Size(max = 11)
    @Column(name = "domain_id")
    private String domainId;
}
