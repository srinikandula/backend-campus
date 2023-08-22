package com.anyaudit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "insepection_agency",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "ia_name")
        } )
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InsepectionAgency extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ia_id")
    private Long iaId;


    @Size(max = 255)
    @Column(name = "ia_name")
    private String iaName;

    @Size(max = 255)
    @Column(name = "ia_status")
    private String iaStatus;

    @Size(max = 11)
    @Column(name = "domain_id")
    private Integer domainId;

    @Column(name = "master_id", columnDefinition = "integer default 0")
    private Integer masterId;
}
