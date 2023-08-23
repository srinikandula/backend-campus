package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fss_head")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FssHead extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fss_id")
    private Long fssId;

    @Size(max = 250)
    @Column(name = "fss_name")
    private String fssName;


    @Column(name = "description")
    private String description;

    @Size(max = 11)
    @Column(name = "assignment_id")
    private Integer assignmentId;

    @Size(max = 11)
    @Column(name = "master_id")
    private Integer masterId;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Size(max = 4)
    @Column(name = "main_or_sub")
    private Integer mainOrSub;

    @ColumnDefault("1")
    @Column(name = "status")
    private String status;
}
