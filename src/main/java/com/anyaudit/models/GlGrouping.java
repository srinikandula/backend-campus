package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gl_grouping", uniqueConstraints = {
        @UniqueConstraint(name = "company_id", columnNames = {"company_id", "gl_group_name","gl_group_parent_name"})



})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GlGrouping extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "company_id")
    private Integer companyId;

    @Size(max = 255)
    @Column(name = "gl_group_name")
    private String glGroupName;

    @Size(max = 11)
    @Column(name = "gl_group_id")
    private Integer glGroupId;

    @Size(max = 255)
    @Column(name = "gl_group_parent_name")
    private String glGroupParentName;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;
}
