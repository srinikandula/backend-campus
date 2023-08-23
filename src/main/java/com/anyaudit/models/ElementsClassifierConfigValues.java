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
@Table(name = "elements_classifier_config_values")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElementsClassifierConfigValues extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eccv_id")
    private Long eccvId;

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
    @Column(name = "classifier_id")
    private Integer classifierId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "classifier_option_id")
    private Integer classifierOptionId;

    @Column(name = "creation_dt")
    private Date creationDt;

    @ColumnDefault("1")
    @Comment("0-inactive,1-active")
    @Column(name = "status")
    private Integer status;
}
