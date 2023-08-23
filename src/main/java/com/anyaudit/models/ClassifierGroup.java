package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "classifier_group")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClassifierGroup extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cgid")
    private Long cgId;

    @Size(max = 250)
    @Column(name = "group_name")
    private String groupName;

    @Size(max = 11)
    @Column(name = "classifier_head_id")
    private Integer classifierHeadId;

    @ColumnDefault("1")
    @Comment("1-custom,2-all")
    @Column(name = "list_type")
    private Integer listType;

    @Column(name = "creation_dt")
    private Date creationDt;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Size(max = 11)
    @Column(name = "master_parent_id")
    private Integer masterParentId;


}
