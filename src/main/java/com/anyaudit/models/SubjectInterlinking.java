package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "subject_interlinking",uniqueConstraints = {
        @UniqueConstraint(name = "parent_element_id", columnNames = {"parent_element_id", "parent_subject_id","child_element_id","child_subject_id","assignment_id"})


})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubjectInterlinking extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "parent_element_id")
    private Integer parentElementId;

    @Size(max = 11)
    @Column(name = "parent_subject_id")
    private Integer parentSubjectId;

    @Size(max = 150)
    @Column(name = "parent_subject_column_name")
    private String parentSubjectColumnName;

    @Size(max = 11)
    @Column(name = "child_element_id")
    private Integer childElementId;

    @Size(max = 11)
    @Column(name = "child_subject_id")
    private Integer childSubjectId;

    @Size(max = 150)
    @Column(name = "child_subject_column_name")
    private String childSubjectColumnName;

    @Column(name = "original")
    @Comment("1- original,2 - duplicate")
    private Integer original;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "creation_dt")
    private Date creationDt;
}
