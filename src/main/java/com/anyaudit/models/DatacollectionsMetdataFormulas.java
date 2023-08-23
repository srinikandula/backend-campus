package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "datacollections_metdata_formulas" ,indexes = {
        @Index(name = "assignment_id_index", columnList = "assignment_id")
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DatacollectionsMetdataFormulas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "ash_id")
    private Integer ashId;


    @Column(name = "formula")
    private String formula;

    @Column(name = "status")
    private Integer status;


}
