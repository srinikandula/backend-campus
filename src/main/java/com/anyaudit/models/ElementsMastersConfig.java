package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "elements_masters_config")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElementsMastersConfig extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ecid")
    private Long ecId;

    @Size(max = 11)
    @Column(name = "element_id")
    private Integer elementId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "master_head_id")
    private Integer masterHeadId;

    @Column(name = "creation_dt")
    private Date creationDt;

    @Size(max = 11)
    @Column(name = "status")
    private Integer status;

    @Size(max = 11)
    @Column(name = "approved_by")
    private Integer approvedBy;

    @Column(name = "approved_dt")
    private Date approvedDt;
}
