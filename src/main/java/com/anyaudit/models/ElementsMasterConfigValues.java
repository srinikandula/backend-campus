package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "elements_master_config_values")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElementsMasterConfigValues extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "elt_config_id")
    private Integer eltConfigId;

    @Size(max = 11)
    @Column(name = "element_id")
    private Integer elementId;

    @Size(max = 11)
    @Column(name = "subject_id")
    private Integer subjectId;

    @Size(max = 11)
    @Column(name = "master_head_id")
    private Integer masterHeadId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "master_list_id")
    private Integer masterListId;

    @Column(name = "creation_dt")
    private Integer creationDt;

    @ColumnDefault("1")
    @Column(name = "status")
    @Comment("0-inactive,1-active")
    private Integer status;
}
