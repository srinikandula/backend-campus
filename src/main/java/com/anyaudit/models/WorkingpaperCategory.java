package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "workingpaper_category" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorkingpaperCategory extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Size(max = 255)
    @Column(name = "category_name")
    private String categoryName;


    @Column(name = "status", columnDefinition = "varchar(15) COMMENT 'active,inactive'")
    private String status;

    @Size(max = 11)
    @Column(name = "attached_by")
    private Integer attachedBy;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "master_id", columnDefinition = "integer default 0")
    private Integer masterId;

}
