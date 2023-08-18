package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "domain_group_details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DomainGroupDetails extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gd_id")
    private Integer gdId;

    @Size(max = 11)
    @Column(name = "domain_group_id")
    private String domainGroupId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private String domainId;
}
