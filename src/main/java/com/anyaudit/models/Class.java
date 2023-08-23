package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "class")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Class extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classid")
    private Long classId;

    @Size(max = 250)
    @Column(name = "class_name")
    private String className;

    @Column(name = "class_desc")
    private String classDesc;

    @Size(max = 20)
    @Column(name = "classifier_id")
    private Integer classifierId;

    @Size(max = 11)
    @Column(name = "parent_class_id")
    private Integer parentClassId;

    @Size(max = 11)
    @Column(name = "class_level")
    private Integer classLevel;

    @Size(max = 20)
    @Column(name = "class_code")
    private Integer classCode;

    @Size(max = 11)
    @Column(name = "level_count")
    private Integer levelCount;

    @Column(name = "class_creationdt")
    private Date classCreationDt;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterid;

    @Size(max = 11)
    @Column(name = "master_parent_id")
    private Integer masterParentId;


}
