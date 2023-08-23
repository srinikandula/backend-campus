package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "daybook_documents")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DayBookDocuments extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 250)
    @Column(name = "name")
    private String name;

    @Size(max = 11)
    @Column(name = "client_id")
    private Integer clientId;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 100)
    @Column(name = "series")
    private String series;

    @Size(max = 11)
    @Column(name = "series_num")
    private Integer seriesNum;
}
