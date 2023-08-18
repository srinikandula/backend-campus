package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "workingpaper_subcategory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorkingPaperSubCategory extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(max = 250)
    @Column(name = "subcategory_name")
    private String subcategoryName;

    @Size(max = 11)
    @Column(name = "category")
    private String category;

    @Size(max = 11)
    @Column(name = "attached_by")
    private String attachedBy;

    @Column(name = "status", columnDefinition = "int(11) NOT NULL COMMENT '1=active,0=inactive'")
    private String status;

    @Size(max = 11)
    @Column(name = "domain")
    private String domain;

    @Size(max = 11)
    @Column(name = "master_id",columnDefinition = " DEFAULT '0'")
    private String masterId;

    @Size(max = 11)
    @Column(name = "master_parent_id",columnDefinition = " DEFAULT '0'")
    private String masterParentId;


}
