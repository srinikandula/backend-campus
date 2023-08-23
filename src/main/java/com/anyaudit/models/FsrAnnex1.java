package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "fsr_annex1")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FsrAnnex1 extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "parameters")
    private String parameters;

    @Column(name = "current_year", columnDefinition = "float(11,2)")
    private Float currentYear;

    @Column(name = "preceding_year", columnDefinition = "float(11,2)")
    private Float precedingYear;

    @Column(name = "status", columnDefinition = "TINYINT(1)")
    private Integer status;

    @Column(name = "created_on")
    private Date createdOn;

}
