package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "subcategory" )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subcategory extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "subcategory_name")
    private String subcategoryName;

    @Size(max = 11)
    @Column(name = "category")
    private Integer category;

    @Size(max = 11)
    @Column(name = "attached_by")
    private Integer attachedBy;

    @Column(name = "status", columnDefinition = "VARCHAR(15) COMMENT 'active,inactive'")
    private String status;


    @Size(max = 11)
    @Column(name = "domain")
    private Integer domain;
}
