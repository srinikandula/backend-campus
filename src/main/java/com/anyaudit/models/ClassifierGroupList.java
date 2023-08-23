package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "classifier_group_list")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClassifierGroupList extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cglid")
    private Long cglId;

    @Size(max = 11)
    @Column(name = "group_id")
    private Integer groupId;

    @Size(max = 11)
    @Column(name = "classifier_head_id")
    private Integer classifierHeadId;

    @Size(max = 11)
    @Column(name = "class_list_id")
    private Integer classListId;


    @Column(name = "creation_dt")
    private Date creationDt;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Size(max = 11)
    @Column(name = "master_parent_id")
    private Integer masterParentId;
}
